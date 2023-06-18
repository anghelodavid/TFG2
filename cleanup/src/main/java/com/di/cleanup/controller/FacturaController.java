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


/**
 * Esta clase se programan los metodos que controlan la aplicación en este caso
 * el crear, guardar ,editar ,listar las facturas y mostrar las facturas .
 * @author anghelo
 *
 */

@Controller
public class FacturaController {

    @Autowired
    private FacturaService service;

    // Mapeo para la página de inicio
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        // Obtiene la lista de facturas
        List<Factura> listFactura = service.listAll();
        // Agrega la lista al modelo para usarla en la vista
        model.addAttribute("listFactura", listFactura);
        // Devuelve el nombre de la vista
        return "index";
    }

    // Mapeo para mostrar los detalles de una factura específica
    @RequestMapping("/show/{id}")
    public String showFacturaDetails(@PathVariable(name = "id") int id, Model model) {
        // Obtiene la factura por su ID
        Factura factura = service.get(id);
        // Agrega la factura al modelo para usarla en la vista
        model.addAttribute("factura", factura);
        // Devuelve el nombre de la vista
        return "mostrarfactura";
    }

    // Mapeo para mostrar la página de creación de una nueva factura
    @RequestMapping("/new")
    public String showNewFactura(Model model) {
        // Crea una nueva Factura
        Factura factura = new Factura();
        // Agrega la factura al modelo para usarla en la vista
        model.addAttribute("factura", factura);
        // Devuelve el nombre de la vista
        return "new_factura";
    }

    // Mapeo para guardar una nueva factura
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveFactura(@ModelAttribute("factura") Factura factura) {
        // Guarda la factura utilizando el servicio
        service.save(factura);
        // Redirige a la página de inicio
        return "redirect:/";
    }

    // Mapeo para mostrar la página de edición de una factura
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditFacturasPage(@PathVariable(name = "id") int id) {
        // Crea un objeto ModelAndView con la vista "edit"
        ModelAndView mav = new ModelAndView("edit");
        // Obtiene la factura por su ID
        Factura factura = service.get(id);
        // Agrega la factura al objeto ModelAndView
        mav.addObject("factura", factura);
        // Devuelve el objeto ModelAndView
        return mav;
    }

    // Mapeo para eliminar una factura
    @RequestMapping("/delete/{id}")
    public String deleteFactura(@PathVariable(name = "id") int id) {
        // Elimina la factura utilizando el servicio
        service.delete(id);
        // Redirige a la página de inicio
        return "redirect:/";
    }
}
