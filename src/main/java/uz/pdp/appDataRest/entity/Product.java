package uz.pdp.appDataRest.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pdp.appDataRest.entity.template.AbsEntity;
import uz.pdp.appDataRest.utils.CodeGeneratorUtil;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends AbsEntity {

    @ManyToOne(optional = false)
    private Category category;
    @OneToOne
    private Attachment photo;

    private String code= CodeGeneratorUtil.generateRandomCode();
    @ManyToOne
    private Measurement measurement;


}
