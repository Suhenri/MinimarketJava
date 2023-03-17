package com.recuperativa.minimarket;


import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinimarketApplication {

	public static Double total(ArrayList<Double> precios){
		Double suma = 0.0;
		for (int i = 0; i < precios.size(); i++) {
			suma += precios.get(i);
		}
		return suma/precios.size();

	public static void main(String[] args) {
	/*  El minimarket cuenta con tipos de productos y productos entre otros objetos
		Se debe crear una función que permita a don Jose obtener las ganancias sobre una
		venta (ocupar hashmap)
		Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
		productos y que luego los muestre.
		Se debe crear una función que dado un diccionario de productos con sus respectivos
		precios se obtenga, la ganancia total, el producto más caro y el producto más barato. */
	}

}




