package uz.pdp.appDataRest.entity;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import uz.pdp.appDataRest.entity.template.AbsEntity;
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class Warehouse extends AbsEntity {
}
