package AH1N1_DANIELB_93.barcode_system;

import AH1N1_DANIELB_93.barcode_system.dao.DiscountRepository;
import AH1N1_DANIELB_93.barcode_system.dao.ProductRepository;
import AH1N1_DANIELB_93.barcode_system.model.Discount;
import AH1N1_DANIELB_93.barcode_system.model.Product;
import AH1N1_DANIELB_93.barcode_system.model.TestEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository productRepository,DiscountRepository discountRepository){
		return args ->{
//			Discount discount = new Discount();
//			discountRepository.save(discount);
//			Product product = productRepository.save(new Product("japko",new BigDecimal(2.3),1,discount));

			Arrays.asList(1132,2234,3673,4633,5543,6567,7330).forEach((barcode)->{
				Discount discount = new Discount("description",Arrays.asList(new Product("produkt" + barcode.toString().codePointAt(0),new BigDecimal(2.3),1,barcode)) );
				discountRepository.save(discount);
			});

			Discount discount = discountRepository.findOne(1L);
			productRepository.save(new Product("produkt_specjalny" ,new BigDecimal(2.3),1,1111))

//			Discount discount = new Discount(Arrays.asList(new Product("japko",new BigDecimal(2.3),1,1234)) );
//			discountRepository.save(discount);
		};
	}
}

