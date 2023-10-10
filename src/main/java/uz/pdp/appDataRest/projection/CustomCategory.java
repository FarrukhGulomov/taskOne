package uz.pdp.appDataRest.projection;

import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Category;
import uz.pdp.appDataRest.projection.template.CustomGeneral;

@Projection(types = Category.class)
public interface CustomCategory extends CustomGeneral {

    Category getParentCategory();
}
