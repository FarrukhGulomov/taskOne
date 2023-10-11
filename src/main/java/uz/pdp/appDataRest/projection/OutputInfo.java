package uz.pdp.appDataRest.projection;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Client;
import uz.pdp.appDataRest.entity.Currency;
import uz.pdp.appDataRest.entity.Output;
import uz.pdp.appDataRest.entity.Warehouse;
import uz.pdp.appDataRest.utils.CodeGeneratorUtil;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Projection(types = Output.class)
public interface OutputInfo {
    Long getId();

    Timestamp getDate();

    @Value("#{target.warehouse.name}")
    String getWarehouseName();

    @Value("#{target.currency.name}")
    String getCurrencyName();

    String getFactureNumber();

    String getCode();

    Client getClient();
}
