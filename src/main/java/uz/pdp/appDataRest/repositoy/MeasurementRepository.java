package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Measurement;
import uz.pdp.appDataRest.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Long> {
}
