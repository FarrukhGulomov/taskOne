package uz.pdp.appDataRest.projection.template;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public interface CustomGeneral {
    Long getId();

    String getName();

    boolean isActive();
}
