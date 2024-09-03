package com.ipesa.punto_venta;

import com.ipesa.punto_venta.subsidiary.domain.entities.Subsidiary;
import com.ipesa.punto_venta.subsidiary.domain.persistence.SubsidiaryDao;
import com.ipesa.punto_venta.subsidiary.services.impl.SubsidiaryServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@SpringBootApplication
public class PuntoVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoVentaApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner (SubsidiaryServiceImpl subsidiaryService) {
//		return args -> {
//			Subsidiary subsidiary = new Subsidiary();
//			subsidiary.setName("Sucursal_example");
//			subsidiary.setAddress("Dirección ejemplo");
//			subsidiary.setPhone("1234567890");
//
//			subsidiaryService.save(subsidiary);
//			List<Subsidiary> subsidiaries = subsidiaryService.findAll();
//			for (Subsidiary subsidiary1 : subsidiaries) {
//				System.out.println(subsidiary1.toString());
//			}
//		};
//	}

}
