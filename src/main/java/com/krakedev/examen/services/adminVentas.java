package com.krakedev.examen.services;

import java.util.ArrayList;

import com.krakedev.examen.Vendedor;

public class adminVentas {
	private ArrayList<Vendedor> vendedores = new ArrayList<>();
	
	public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

}
