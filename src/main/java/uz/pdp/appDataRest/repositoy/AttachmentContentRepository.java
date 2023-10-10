package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.AttachmentContent;

import java.util.Optional;

@RepositoryRestResource(path = "attachment-contents")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Long> {
    Optional<AttachmentContent> findByAttachmentId(Long attachment_id);
}
