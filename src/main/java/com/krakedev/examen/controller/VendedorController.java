package com.krakedev.examen.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.VendedorComision;
import com.krakedev.examen.VendedorMixto;
import com.krakedev.examen.services.adminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private static adminVentas admin = new adminVentas();

    @PostMapping("/agregar")
    public Vendedor agregarVendedor(@RequestBody Vendedor vendedor) { // Cambiado de void a Vendedor
        Vendedor nuevoVendedor = null;

        if (vendedor.getTipo().equals("V")) {
            nuevoVendedor = new Vendedor(vendedor.getCedula(), "V");
        } else if (vendedor.getTipo().equals("C")) {
            nuevoVendedor = new VendedorComision(vendedor.getCedula());
        } else if (vendedor.getTipo().equals("M")) {
            nuevoVendedor = new VendedorMixto(vendedor.getCedula());
        }

        if (nuevoVendedor != null) {
            nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
            nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
            nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());

            admin.agregar(nuevoVendedor);
        }

        return nuevoVendedor;
    }
    @GetMapping("/calcular/{cedula}")
    public Double calcularSueldoVendedor(
            @PathVariable String cedula) {

        return admin.calcularSueldo(cedula);
    }
    @GetMapping("/listar")
    public ArrayList<Vendedor> listarVendedores() {
        return admin.getVendedores();
    }
}