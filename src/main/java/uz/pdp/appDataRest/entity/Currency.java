package uz.pdp.appDataRest.entity;

import jakarta.persistence.Entity;
import lombok.*;
import uz.pdp.appDataRest.entity.template.AbsEntity;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class Currency extends AbsEntity {

}
