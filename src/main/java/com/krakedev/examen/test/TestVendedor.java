package com.krakedev.examen.test;

import com.krakedev.examen.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		Vendedor vendedorUno = new Vendedor("1725896341","V");
		
		vendedorUno.setSueldoFijo(450.0);
		
		System.out.println("Datos del Vendedor:");
        System.out.println(vendedorUno);
        System.out.println("Sueldo calculado: " + vendedorUno.calcularSueldo());
	}

}
