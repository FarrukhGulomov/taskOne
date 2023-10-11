package uz.pdp.appDataRest.projection;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Input;
import uz.pdp.appDataRest.entity.InputProduct;
import uz.pdp.appDataRest.entity.Product;
import uz.pdp.appDataRest.utils.CurrentDate;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductInfo {
    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
