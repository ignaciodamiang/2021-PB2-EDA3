package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;

	public Corredor(Integer nroDeSocio, String nombreDeportista, Integer distanciaPreferida) {
		super(nroDeSocio, nombreDeportista);
		this.distanciaPreferida=distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}
}
