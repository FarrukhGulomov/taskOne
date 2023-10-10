package uz.pdp.appDataRest.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import uz.pdp.appDataRest.entity.Attachment;
import uz.pdp.appDataRest.entity.AttachmentContent;
import uz.pdp.appDataRest.repositoy.AttachmentContentRepository;
import uz.pdp.appDataRest.repositoy.AttachmentRepository;

import java.util.Optional;

@RepositoryRestController
public class FileUploadDownloadController {

    private final AttachmentRepository attachmentRepository;
    private final AttachmentContentRepository attachmentContentRepository;

    public FileUploadDownloadController(AttachmentRepository attachmentRepository, AttachmentContentRepository attachmentContentRepository) {
        this.attachmentRepository = attachmentRepository;
        this.attachmentContentRepository = attachmentContentRepository;
    }

    @SneakyThrows
    @PostMapping("attachments/upload")
    public ResponseEntity<?> uploadFile(@RequestPart(value = "file") MultipartFile file) {
        Attachment attachment = new Attachment();
        attachment.setName(file.getName());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());

        // сохраняем объект Attachment
        Attachment savedAttachment = attachmentRepository.save(attachment);

        // сохраняем содержимое файла
        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(savedAttachment);
        attachmentContentRepository.save(attachmentContent);

        return ResponseEntity.ok().build();
    }

    @SneakyThrows
    @GetMapping("attachments/download/{id}")
    public void download(@PathVariable Long id, HttpServletResponse response) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachmentId(id);
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment; fileName=\"" + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }


        }
    }
}