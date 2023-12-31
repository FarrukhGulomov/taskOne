package uz.pdp.appDataRest.projection;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.User;
import uz.pdp.appDataRest.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface UsersInfo {

    Long getId();
    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean isActive();
    Set<Warehouse> getWarehouses();
}
