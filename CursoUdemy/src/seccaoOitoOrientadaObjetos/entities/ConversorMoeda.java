package seccaoOitoOrientadaObjetos.entities;

public class ConversorMoeda {

	public static final double IOF = 0.06;
	
	public static double conversor(double v, double qtd) {
		double total = (v * qtd);
		return total + (total * IOF);
	}
}
