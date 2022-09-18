package sorbie.jon.springdatarestopenapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Item {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long itemNumber;

    private String name;
    private String description;
}
