package com.krakedev.examen.test;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.VendedorComision;
import com.krakedev.examen.VendedorMixto;
import com.krakedev.examen.services.adminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		
		adminVentas admin = new adminVentas();

        Vendedor vBase = new Vendedor("1700000001","V");
        VendedorComision vComision = new VendedorComision("1700000002");
        VendedorMixto vMixto = new VendedorMixto("1700000003");

        vBase.setSueldoFijo(400.0);

        vComision.setComisionPorVenta(50.0);
        vComision.setNumeroVentas(4); 

        vMixto.setSueldoFijo(1000.0);
        vMixto.setNumeroVentas(10); 

        admin.agregar(vBase);
        admin.agregar(vComision);
        admin.agregar(vMixto);

        System.out.println("Sueldo Base: " + admin.calcularSueldo("1700000001"));
        System.out.println("Sueldo Comisión: " + admin.calcularSueldo("1700000002"));
        System.out.println("Sueldo Mixto: " + admin.calcularSueldo("1700000003"));

        System.out.println("Cédula inexistente: " + admin.calcularSueldo("9999999999"));
    }

	}


