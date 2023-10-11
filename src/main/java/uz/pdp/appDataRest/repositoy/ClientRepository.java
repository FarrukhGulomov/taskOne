package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Client;
import uz.pdp.appDataRest.projection.ClientInfo;

@RepositoryRestResource(path = "clients",collectionResourceRel = "clientInfo",excerptProjection = ClientInfo.class)
public interface ClientRepository extends JpaRepository<Client,Long> {
}
