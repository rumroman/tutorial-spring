package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack","Bauer"));
            repository.save(new Customer("Chloe", "O'Brain"));
            repository.save(new Customer("Kim","Bauer"));
            repository.save(new Customer("David","Palmer"));
            repository.save(new Customer("Michelle","Dessler"));

            //fetch all customers
            log.info("Customers found with findAll():");
            log.info("-----------------------------");
            repository.findAll().forEach(customer -> log.info(customer.toString()));

        };
    }
}
