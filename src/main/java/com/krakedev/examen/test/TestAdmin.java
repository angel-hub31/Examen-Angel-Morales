package com.krakedev.examen.test;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.VendedorComision;
import com.krakedev.examen.VendedorMixto;

public class TestAdmin {

	public static void main(String[] args) {
		
		AdminVentas admin = new AdminVentas();

        // 2. Crear instancias de los tres tipos de vendedores [cite: 74]
        Vendedor vBase = new Vendedor("1700000001");
        VendedorComision vComision = new VendedorComision("1700000002");
        VendedorMixto vMixto = new VendedorMixto("1700000003");

        // 3. Setear datos necesarios para los cálculos [cite: 75]
        vBase.setSueldoFijo(400.0);

        vComision.setComisionPorVenta(50.0);
        vComision.setNumeroVentas(4); // 50 * 4 = 200

        vMixto.setSueldoFijo(1000.0);
        vMixto.setNumeroVentas(10); // 1000 + (1000 * 0.01 * 10) = 1100

        // 4. Agregar los vendedores al administrador [cite: 76]
        admin.agregar(vBase);
        admin.agregar(vComision);
        admin.agregar(vMixto);

        // 5. Probar el método calcularSueldo con los tres vendedores [cite: 77]
        System.out.println("Sueldo Base: " + admin.calcularSueldo("1700000001"));
        System.out.println("Sueldo Comisión: " + admin.calcularSueldo("1700000002"));
        System.out.println("Sueldo Mixto: " + admin.calcularSueldo("1700000003"));

        // 6. Probar con una cédula inexistente (debe imprimir null) [cite: 78]
        System.out.println("Cédula inexistente: " + admin.calcularSueldo("9999999999"));
    }

	}


