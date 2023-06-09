package com.di.cleanup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.di.cleanup.dto.Factura;
import com.di.cleanup.Service.FacturaService;

@Controller
public class FacturaController {

	@Autowired
	private FacturaService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Factura> listFactura = service.listAll();
		model.addAttribute("listFactura", listFactura);
		
		return "index";
	}
	@RequestMapping("/show/{id}")
	public String showFacturaDetails(@PathVariable(name = "id") int id, Model model) {
	    Factura factura = service.get(id);
	    model.addAttribute("factura", factura);
	    return "mostrarfactura";
	}
	
	@RequestMapping("/new")
	public String showNewFactura(Model model) {
		Factura factura = new Factura();
		model.addAttribute("factura", factura);
		
		return "new_factura";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveFactura(@ModelAttribute("factura")Factura factura ) {
		service.save(factura);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditFacturasPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit");
		Factura factura = service.get(id);
		mav.addObject("factura", factura);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteFactura(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}

}