package uz.pdp.appDataRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import uz.pdp.appDataRest.utils.CodeGeneratorUtil;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date = Timestamp.valueOf(LocalDateTime.now());

    @ManyToOne(fetch = FetchType.EAGER)
    private Warehouse warehouse;

    @ManyToOne(fetch = FetchType.EAGER)
    private Currency currency;
    @Column(nullable = false, unique = true)
    private String factureNumber;

    private String code = CodeGeneratorUtil.generateRandomCode();

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

}
