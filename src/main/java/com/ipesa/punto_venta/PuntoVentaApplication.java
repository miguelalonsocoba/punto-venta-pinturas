package com.ipesa.punto_venta;

import com.ipesa.punto_venta.warehouse.brand.domain.entities.Brand;
import com.ipesa.punto_venta.warehouse.product.domain.entity.Product;
import com.ipesa.punto_venta.warehouse.product.service.IProductService;
import com.ipesa.punto_venta.warehouse.supplier.domain.entities.Supplier;
import com.ipesa.punto_venta.warehouse.supplier.service.ISupplierService;
import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PuntoVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoVentaApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner (IProductService productService) {
//		return args -> {
//
//			Product product = new Product();
//			product.setName("Pintura5");
//			product.setStocks(0);
//			product.setMinimumAmount(15);
//			product.setDateOfCreation(new Date());
//			product.setUnitCost(26000.00);
//			product.setUnitPrice(2800.00);
//			Supplier supplier = new Supplier();
//			supplier.setId(1);
//			product.setSupplier(supplier);
//			Brand brand = new Brand();
//			brand.setId(2);
//			product.setBrand(brand);
//			ProductType productType = new ProductType();
//			productType.setId(1);
//			product.setProductType(productType);
//
//			productService.save(product);
//
//			for (Product product1 : productService.findAll()) {
//				System.out.println(product1);
//			}
//		};
//	}

}
