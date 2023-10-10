package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Product;
import uz.pdp.appDataRest.projection.CustomProduct;

@RepositoryRestResource(path = "products",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Long> {
}
