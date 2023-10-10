package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appDataRest.entity.Supplier;
import uz.pdp.appDataRest.projection.CustomSupplier;

@RepositoryRestResource(path = "suppliers", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @RestResource()
    boolean existsByPhoneNumber(String phoneNumber);
}
