package com.ipesa.punto_venta.warehouse.type_product.controller;

import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;
import com.ipesa.punto_venta.warehouse.type_product.service.IProductTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@RequestMapping(value = "/punto_venta/warehouse/type_product")
@SessionAttributes(value = "productType")
public class TypeProductController {

    private IProductTypeService productTypeService;

    @Autowired
    public TypeProductController(IProductTypeService productTypeService){
        this.productTypeService = productTypeService;
    }

    @RequestMapping(value = "/type_products", method = RequestMethod.GET)
    public String viewTypeProducts(Model model) {
        model.addAttribute("typeProducts", productTypeService.findAll());
        return "warehouse/type_product/type_products_view";
    }

    @RequestMapping(value = "/form")
    public String create(Map<String, Object> model) {
        ProductType productType = new ProductType();
        model.put("productType", productType);
        return "warehouse/type_product/type_product_form_view";
    }

    @RequestMapping(value = "/form_type_product/{id}")
    public String update(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
        System.out.println("------Method Ipdate: id: " + id);
        ProductType productType = null;
        if (id > 0) {
            productType = productTypeService.findById(id);
        } else {
            return "redirect:/punto_venta/warehouse/type_product/type_products";
        }
        model.put("productType", productType);
        System.out.println("-------- ProductType: " + productType);
        return "warehouse/type_product/type_product_form_view";
    }

    @RequestMapping(value = "/form_type_product_create", method = RequestMethod.POST)
    public String save(@Valid ProductType typeProduct, BindingResult bindingResult, Model model, SessionStatus status) {
        if (bindingResult.hasErrors()) {
            return "warehouse/type_product/type_product_form_view";
        }
        productTypeService.save(typeProduct);
        status.setComplete();
        return "redirect:/punto_venta/warehouse/type_product/type_products";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable(value = "id") Integer id) {
        if (id > 0) {
            productTypeService.deleteById(id);

        }
        return "redirect:/punto_venta/warehouse/type_product/type_products";
    }
}
