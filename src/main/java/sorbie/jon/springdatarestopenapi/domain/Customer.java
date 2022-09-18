package sorbie.jon.springdatarestopenapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer accountNumber;

    private String name;
    private String email;
}
