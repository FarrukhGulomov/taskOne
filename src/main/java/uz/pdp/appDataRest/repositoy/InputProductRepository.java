package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appDataRest.entity.InputProduct;
import uz.pdp.appDataRest.projection.InputProductInfo;

@RepositoryRestResource(path = "inputProducts",excerptProjection = InputProductInfo.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Long> {
}
