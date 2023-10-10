package uz.pdp.appDataRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import uz.pdp.appDataRest.entity.template.AbsEntity;
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends AbsEntity {

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    @JsonIgnoreProperties("parentCategory")
    private Category parentCategory;
}
