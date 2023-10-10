package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Warehouse;
import uz.pdp.appDataRest.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouses",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
}
