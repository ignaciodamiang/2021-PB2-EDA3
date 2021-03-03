package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{

	private String tipoDeBicicleta;

	public Ciclista(Integer nroDeSocio, String nombreDeportista, String tipoDeBicicleta) {
		super(nroDeSocio, nombreDeportista);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}

	public String getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

	
}
