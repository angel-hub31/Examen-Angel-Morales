package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VendedorMixtoTest {
	@Test
    public void testCalcularSueldoMixto() {
        VendedorMixto vendedorM = new VendedorMixto("1700000003");
        
        double sueldoBase = 1000.0;
        int ventas = 10;
        vendedorM.setSueldoFijo(sueldoBase);
        vendedorM.setNumeroVentas(ventas);
        
        double sueldoEsperado = 1100.0;
        double sueldoObtenido = vendedorM.calcularSueldo();
        
        assertEquals(sueldoEsperado, sueldoObtenido, "El sueldo debe incluir el 1% del sueldo fijo por cada venta");
    }

}
