package com.ipesa.punto_venta.warehouse.controller;

import com.ipesa.punto_venta.warehouse.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/punto_venta/warehouse")
@SessionAttributes(value = "warehouse")
public class Warehouse {

    private IProductService productService;

    @Autowired
    public Warehouse(IProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/warehouses", method = RequestMethod.GET)
    public String viewWarehouse(Model model) {
        model.addAttribute("products", productService.findAll());
        return "warehouse/warehauses_view";
    }
}

