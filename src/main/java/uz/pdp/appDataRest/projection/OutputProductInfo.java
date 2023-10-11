package uz.pdp.appDataRest.projection;

import jakarta.persistence.*;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Output;
import uz.pdp.appDataRest.entity.OutputProduct;
import uz.pdp.appDataRest.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutputProductInfo {
    Long getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
