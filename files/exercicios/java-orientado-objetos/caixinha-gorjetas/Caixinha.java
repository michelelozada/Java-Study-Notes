package github.repositorio.estudo.java;

import java.util.ArrayList;
import java.util.List;

public class Caixinha {
	
	// Criando um ArrayList da classe Gorjeta
	private List<Gorjeta> arrayDeGorjetas = new ArrayList<>();
	
	// Adicionando as gorjetas recebidas ao array
	public void incluirGorjeta(Gorjeta gorjeta) {
		arrayDeGorjetas.add(gorjeta);
	}
	
	// Método para totalizar valor das gorjetas recebidas
	public double totalizarGorjetas() {
		double valorTotalGorjetas = 0;
		for(Gorjeta g: arrayDeGorjetas) {
			valorTotalGorjetas += g.getValorGorjeta();
		}
		return valorTotalGorjetas;
	}
}