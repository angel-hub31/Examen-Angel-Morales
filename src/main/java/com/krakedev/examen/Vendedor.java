package com.krakedev.examen;

public class Vendedor {
	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;
	private String tipo;

	public Vendedor(String cedula) {
		this.cedula = cedula;
	}

	public String getCedula() {
		return cedula;
	}

	// metodo calcularSueldo
	public double calcularSueldo() {
		return sueldoFijo;
	}

	// metodo toString

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", numeroVentas=" + numeroVentas + ", sueldoFijo=" + sueldoFijo
				+ ", comisionPorVenta=" + comisionPorVenta + "]";
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}

}
