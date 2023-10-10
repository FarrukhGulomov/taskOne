package uz.pdp.appDataRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class AttachmentContent {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private byte[] bytes;
        @OneToOne
        private Attachment attachment;
    }
