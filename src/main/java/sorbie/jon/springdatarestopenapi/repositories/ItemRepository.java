package sorbie.jon.springdatarestopenapi.repositories;

import org.springframework.data.repository.*;
import sorbie.jon.springdatarestopenapi.domain.*;

public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
}
