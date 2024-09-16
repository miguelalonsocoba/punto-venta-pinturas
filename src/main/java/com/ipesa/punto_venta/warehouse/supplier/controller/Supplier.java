package com.ipesa.punto_venta.warehouse.supplier.controller;

import com.ipesa.punto_venta.warehouse.supplier.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/punto_venta/warehouse/supplier")
@SessionAttributes(value = "supplier")
public class Supplier {

    private ISupplierService supplierService;

    @Autowired
    public Supplier(ISupplierService supplierService){
        this.supplierService = supplierService;
    }

    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public String viewSuppliers(Model model){
        model.addAttribute("suppliers", supplierService.findAll());
        return "warehouse/supplier/suppliers_view";
    }
}
