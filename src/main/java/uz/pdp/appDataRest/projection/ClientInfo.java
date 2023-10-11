package uz.pdp.appDataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Client;

@Projection(types = Client.class)
public interface ClientInfo {

    Long getId();
    String getName();
    String getPhoneNumber();
}
