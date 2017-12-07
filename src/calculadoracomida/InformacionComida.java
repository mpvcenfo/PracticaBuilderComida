/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
	private final String nombre;
	private final int cantidadPorcion;
	private final Medida unidadDeMedida;
	private final int porciones;
	private final int calorias;
	private final int grasa;
	private final int sodio;
	private final int carbohidratos;

	public InformacionComida(final String pNombre, final int pCantidadPorcion, final Medida pMedida,
			final int pPorciones, final int pCalorias, final int pGrasa, final int pSodio, final int pCarbohidratos) {
		this.nombre = pNombre;
		this.cantidadPorcion = pCantidadPorcion;
		this.unidadDeMedida = pMedida;
		this.porciones = pPorciones;
		this.calorias = pCalorias;
		this.grasa = pGrasa;
		this.sodio = pSodio;
		this.carbohidratos = pCarbohidratos;
	}

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}

	public static class InformacionComidaBuilder {
		private String nestedNombre;
		private int nestedCantidadPorcion;
		private Medida nestedUnidadDeMedida;
		private int nestedPorciones;
		private int nestedCalorias;
		private int nestedGrasa;
		private int nestedSodio;
		private int nestedCarbohidratos;

		public InformacionComidaBuilder(final String newNombre) {
			this.nestedNombre = newNombre;
		}

		public InformacionComidaBuilder cantidadPorcion(int pCantidadPorcion) {
			this.nestedCantidadPorcion = pCantidadPorcion;
			return this;
		}

		public InformacionComidaBuilder unidadDeMedida(Medida pMedida) {
			this.nestedUnidadDeMedida = pMedida;
			return this;
		}

		public InformacionComidaBuilder porciones(int pPorciones) {
			this.nestedPorciones = pPorciones;
			return this;
		}

		public InformacionComidaBuilder calorias(int pCalorias) {
			this.nestedCalorias = pCalorias;
			return this;
		}

		public InformacionComidaBuilder grasa(int pGrasa) {
			this.nestedGrasa = pGrasa;
			return this;
		}

		public InformacionComidaBuilder sodio(int pSodio) {
			this.nestedSodio = pSodio;
			return this;
		}

		public InformacionComidaBuilder carbohidratos(int pCarbohidratos) {
			this.nestedCarbohidratos = pCarbohidratos;
			return this;
		}

		public InformacionComida createInformacionComida() {
			return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones,
					nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
		}
	}
}
