package uz.pdp.appDataRest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appDataRest.entity.Currency;
@RepositoryRestResource(path = "currencies")
public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
