package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.OutputProduct;
import uz.pdp.appDataRest.projection.OutputProductInfo;

@RepositoryRestResource(path = "outputProducts",collectionResourceRel = "outputProductInfo",excerptProjection = OutputProductInfo.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Long> {
}
