package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Output;
import uz.pdp.appDataRest.projection.OutputInfo;

@RepositoryRestResource(path = "outputs",collectionResourceRel = "outputInfo",excerptProjection = OutputInfo.class)
public interface OutputRepository extends JpaRepository<Output,Long> {
}
