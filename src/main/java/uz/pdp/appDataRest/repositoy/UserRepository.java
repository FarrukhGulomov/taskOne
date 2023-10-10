package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.User;
import uz.pdp.appDataRest.projection.UsersInfo;

@RepositoryRestResource(path = "users",excerptProjection = UsersInfo.class)
public interface UserRepository extends JpaRepository<User,Long> {
}
