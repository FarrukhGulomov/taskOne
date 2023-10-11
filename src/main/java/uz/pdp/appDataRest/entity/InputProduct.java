package uz.pdp.appDataRest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import uz.pdp.appDataRest.utils.CurrentDate;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private Double amount = 0.0;
    private Double price = 0.0;
    @JsonFormat(pattern = "MMMM-dd-yyyy")
    @DateTimeFormat(pattern = "MMMM-dd-yyyy")
    private Date expireDate = CurrentDate.expireDate();

    @ManyToOne
    private Input input;
}
