/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.InformacionComidaBuilder;

/**
 *
 * @author maguero
 */
public class CalculadoraComida {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		InformacionComida porcionOllaDeCarne;
		InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder("Olla De Carne");
		builder = builder.cantidadPorcion(240);
		builder = builder.unidadDeMedida(Medida.ML);
		builder = builder.porciones(2);
		builder = builder.calorias(350);
		builder = builder.grasa(40);
		builder = builder.sodio(50);
		builder = builder.carbohidratos(10);
		porcionOllaDeCarne = builder.createInformacionComida();
		System.out.println(porcionOllaDeCarne.toString());
		
		InformacionComida porcionCasado;
		InformacionComidaBuilder builder2 = new InformacionComida.InformacionComidaBuilder("Casado");
		builder2 = builder2.cantidadPorcion(200);
		builder2 = builder2.unidadDeMedida(Medida.G);
		builder2 = builder2.porciones(1);
		builder2 = builder2.calorias(850);
		builder2 = builder2.grasa(25);
		builder2 = builder2.sodio(35);
		builder2 = builder2.carbohidratos(50);
		porcionCasado = builder2.createInformacionComida();
		System.out.println(porcionCasado.toString());
	}

}
