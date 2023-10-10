package uz.pdp.appDataRest.projection;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appDataRest.entity.Currency;
import uz.pdp.appDataRest.entity.Input;
import uz.pdp.appDataRest.entity.Supplier;
import uz.pdp.appDataRest.entity.Warehouse;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Projection(types = Input.class)
public interface InputInfo {
    Long getId();

    Timestamp getDate();

    @Value("#{target.warehouse.name}")
    String getWarehouseName();

    @Value("#{target.supplier.name}")
    String getSupplierName();

    @Value("#{target.currency.name}")
    String getCurrencyName();

    String getFactureNumber();
    String getCode();
}
