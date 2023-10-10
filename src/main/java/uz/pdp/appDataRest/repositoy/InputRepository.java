package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Input;
import uz.pdp.appDataRest.projection.InputInfo;

@RepositoryRestResource(path = "inputs",excerptProjection = InputInfo.class)
public interface InputRepository extends JpaRepository<Input,Long> {
}
