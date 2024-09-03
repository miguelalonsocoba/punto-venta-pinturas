package com.ipesa.punto_venta.subsidiary.controllers;

import com.ipesa.punto_venta.subsidiary.domain.entities.Subsidiary;
import com.ipesa.punto_venta.subsidiary.services.SubsidiaryService;
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
@RequestMapping(value = "/punto_venta/subsidiary")
@SessionAttributes("subsidiary")
public class SubsidiaryController {

    SubsidiaryService subsidiaryService;

    @Autowired
    public SubsidiaryController(SubsidiaryService subsidiaryService) {
        this.subsidiaryService = subsidiaryService;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home_view";
    }

    @RequestMapping(value = "/subsidiaries", method = RequestMethod.GET)
    public String viewSubsidiaries(Model model){
        model.addAttribute("subsidiaries", subsidiaryService.findAll());
        return "subsidiaries_view";
    }

    @RequestMapping(value = "/form")
    public String create(Map<String, Object> model) {
        Subsidiary subsidiary = new Subsidiary();
        model.put("subsidiary", subsidiary);
        return "subsidiary_form_view";
    }

    @RequestMapping(value = "/form_subsidiary/{id}")
    public String update(@PathVariable(value = "id") Integer id, Map<String, Object> model){
        Subsidiary subsidiary = null;
        if (id > 0) {
            subsidiary = subsidiaryService.findById(id);
        } else {
            return "redirect:/punto_venta/subsidiary/subsidiaries";
        }
        model.put("subsidiary", subsidiary);
        return "subsidiary_form_view";
    }

    @RequestMapping(value = "subsidiary_form_create", method = RequestMethod.POST)
    public String save(@Valid Subsidiary subsidiary, BindingResult bindingResult, Model model, SessionStatus status) {
        if (bindingResult.hasErrors()) {
            return "subsidiary_form_view";
        }
        subsidiaryService.save(subsidiary);
        status.setComplete();
        return "redirect:/punto_venta/subsidiary/subsidiaries";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable(value = "id") Integer id) {
        if (id > 0) {
            subsidiaryService.deleteById(id);
        }
        return "redirect:/punto_venta/subsidiary/subsidiaries";
    }

}
