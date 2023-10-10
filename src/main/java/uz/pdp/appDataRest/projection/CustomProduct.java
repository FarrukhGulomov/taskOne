package uz.pdp.appDataRest.projection;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Attachment;
import uz.pdp.appDataRest.entity.Category;
import uz.pdp.appDataRest.entity.Measurement;
import uz.pdp.appDataRest.entity.Product;
import uz.pdp.appDataRest.projection.template.CustomGeneral;

@Projection(types = Product.class)
public interface CustomProduct extends CustomGeneral {
    @Value("#{target.category.name}")
    String getCategoryName();

    @Value("#{target.photo.name}")
    String getPhotoName();

    String getCode();

    @Value("#{target.measurement.name}")
    String getMeasurementName();
}
