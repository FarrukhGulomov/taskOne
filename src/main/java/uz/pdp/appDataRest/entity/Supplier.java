package uz.pdp.appDataRest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import uz.pdp.appDataRest.entity.template.AbsEntity;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Supplier extends AbsEntity {
    @Column(unique = true,nullable = false)
    private String phoneNumber;
}
