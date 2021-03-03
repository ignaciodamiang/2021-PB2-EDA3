package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo) {
		super();
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		participantes = new HashMap<Integer, Deportista>();
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public Integer agregarParticipante(Deportista aInscribir) {
		participantes.put(++numeroDeInscripcion, aInscribir);
		return numeroDeInscripcion;
	}

}
