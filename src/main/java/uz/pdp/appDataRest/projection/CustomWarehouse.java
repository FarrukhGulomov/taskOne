package uz.pdp.appDataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Warehouse;
import uz.pdp.appDataRest.projection.template.CustomGeneral;
@Projection(types = Warehouse.class)
public interface CustomWarehouse extends CustomGeneral{
}
