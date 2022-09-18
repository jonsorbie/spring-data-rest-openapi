package sorbie.jon.springdatarestopenapi.util;

import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import sorbie.jon.springdatarestopenapi.domain.*;
import sorbie.jon.springdatarestopenapi.repositories.*;

/**
 * Loads a bit of data up front into the H2 database
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class LocalDataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;


    @Override
    public void run(String... args) throws Exception {
        log.info("Beginning data load...");

        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("a@b.com");
        customerRepository.save(customer);

        Item item = new Item();
        item.setName("Haribo Goldbears");
        item.setDescription("Delicious Gummy Candy");
        itemRepository.save(item);

        log.info("End data load.");
    }
}
