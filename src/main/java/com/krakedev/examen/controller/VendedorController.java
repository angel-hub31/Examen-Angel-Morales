package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.VendedorComision;
import com.krakedev.examen.VendedorMixto;
import com.krakedev.examen.services.adminVentas;

@RestController
	@RequestMapping("/vendedores")
	public class VendedorController {
	    private static adminVentas admin = new adminVentas();

	    @PostMapping("/agregar")
	    public void agregarVendedor(@RequestBody Vendedor vendedor) {
	        Vendedor nuevoVendedor;
	        
	        if (vendedor.getTipo().equals("V")) {
	            nuevoVendedor = new Vendedor(vendedor.getCedula(), "V");
	        } else if (vendedor.getTipo().equals("C")) {
	            nuevoVendedor = new VendedorComision(vendedor.getCedula());
	        } else if (vendedor.getTipo().equals("M")) {
	            nuevoVendedor = new VendedorMixto(vendedor.getCedula());
	        } else {
	            return; 
	        }

	        nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
	        nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());
	        nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());

	        admin.agregar(nuevoVendedor);
	    }

	    @GetMapping("/calcular/{cedula}")
	    public Double calcularSueldoVendedor(@PathVariable String cedula) {
	        return admin.calcularSueldo(cedula);
	    }
	}


