package uz.pdp.appDataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Supplier;
import uz.pdp.appDataRest.projection.template.CustomGeneral;
@Projection(types = Supplier.class)
public interface CustomSupplier extends CustomGeneral {

    String getPhoneNumber();
}
