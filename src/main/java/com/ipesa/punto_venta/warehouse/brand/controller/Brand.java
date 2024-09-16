package com.ipesa.punto_venta.warehouse.brand.controller;

import com.ipesa.punto_venta.warehouse.brand.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/punto_venta/warehouse/brand")
@SessionAttributes(value = "brand")
public class Brand {

    IBrandService brandService;

    @Autowired
    public Brand(IBrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping(value = "/brands", method = RequestMethod.GET)
    public String viewBrands(Model model) {
        model.addAttribute("brands", brandService.findAll());
        return "warehouse/brand/brands_view";
    }
}
