package AH1N1_DANIELB_93.barcode_system;

import dao.ProductRepository;
import model.Discount;
import model.Product;
import model.TestEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

//	@Bean
//	CommandLineRunner runner(ProductRepository repository){
//		return args ->{
//			Product product = new Product();
//			product.setPamount(1);
//			//product.setPdiscount(new Discount());
//			product.setPname("japko");
//			product.setPprice(new BigDecimal(2.3));
//
//			repository.save(new TestEntity());
//
//		};
//	}
}

