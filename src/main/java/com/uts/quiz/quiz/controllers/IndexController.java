package com.uts.quiz.quiz.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uts.quiz.quiz.models.entities.Cliente;

@Controller
public class IndexController {

    
    @RequestMapping(value ="/index",   method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("titulo", "Listado de clientes"); 
        model.addAttribute("clientes",getClientes());
        return "listar";
    }
    
    @RequestMapping(value="/form")
    public String crear(Model model){
    	model.addAttribute("titulo","Crear cliente");
    	return "form";
    }
    
    private List<Cliente> getClientes(){
    	
    	List<Cliente> clientes=new ArrayList<>();
    	clientes.add(new Cliente(1,"Camilo","Rodriguez","crodrigr@gmail.com"));
    	clientes.add(new Cliente(2,"Carlo","camargo","ccamargo@gmail.com"));
    	clientes.add(new Cliente(3,"Diana","Tarazona","ctarzona@gmail.com"));
    	clientes.add(new Cliente(4,"Diego","Rangel","drangel@gmail.com"));
    	clientes.add(new Cliente(5,"Julian","Nieto","jnieto@gmail.com"));
    	clientes.add(new Cliente(6,"Jairo","Bermudez","jbermudez@gmail.com"));
    	clientes.add(new Cliente(7,"Hernan","Garcia","hgarcia@gmail.com"));
    	clientes.add(new Cliente(8,"Hermes","Navaro","hnavaro@gmail.com"));
    	clientes.add(new Cliente(9,"Sergio","Molina","crodrigr@gmail.com"));
    	return clientes;
    	
    	
     	
    }
    
}
