package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(678, "cereal");

		// descripcion y peso

		p1.setDescripcion("Se utiliza en el desayuno");
		p1.setPeso(45.6);

		System.out.println("Bienvenidxs!!!!");
		System.out.println("Su primer producto es: " + p1.getNombre());
		System.out.println("Descripcion: " + p1.getDescripcion() + "el cual tiene un peso de: " + p1.getPeso());

	}

}
