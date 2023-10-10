package uz.pdp.appDataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Measurement;
import uz.pdp.appDataRest.projection.template.CustomGeneral;

@Projection(types = Measurement.class)
public interface CustomMeasurement extends CustomGeneral {

}
