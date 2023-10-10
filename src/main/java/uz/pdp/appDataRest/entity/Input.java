package uz.pdp.appDataRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.appDataRest.utils.CodeGeneratorUtil;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date=Timestamp.valueOf(LocalDateTime.now());

    @ManyToOne(optional = false)
    private Warehouse warehouse;

    @ManyToOne(optional = false)
    private Supplier supplier;

    @ManyToOne(optional = false)
    private Currency currency;

    @Column(nullable = false, unique = true)
    private String factureNumber;


    private String code= CodeGeneratorUtil.generateRandomCode();
}
