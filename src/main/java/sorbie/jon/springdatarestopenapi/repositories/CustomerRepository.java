package sorbie.jon.springdatarestopenapi.repositories;

import org.springframework.data.repository.*;
import sorbie.jon.springdatarestopenapi.domain.*;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
