package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VendedorJUnitTest {
	
	@Test
    public void testCalcularSueldoVendedor() {
        Vendedor vendedor = new Vendedor("1725896341","C");
        double sueldoEsperado = 500.0;
        
        vendedor.setSueldoFijo(sueldoEsperado);
        double sueldoObtenido = vendedor.calcularSueldo();
        
        assertEquals(sueldoEsperado, sueldoObtenido);
    }

}
