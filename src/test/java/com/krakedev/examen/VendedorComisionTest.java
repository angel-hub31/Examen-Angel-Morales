package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VendedorComisionTest {
	@Test
    public void testCalcularSueldoComision() {
        VendedorComision vendedorC = new VendedorComision("1700000002");
        
        vendedorC.setComisionPorVenta(25.0);
        vendedorC.setNumeroVentas(10);
        
        double sueldoEsperado = 250.0;
        double sueldoObtenido = vendedorC.calcularSueldo();
        
        assertEquals(sueldoEsperado, sueldoObtenido, "El sueldo debe ser la comisión multiplicada por las ventas");
    }

}
