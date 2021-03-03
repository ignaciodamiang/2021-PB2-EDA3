package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarDeportista(Deportista deportistaAgregado) {
		this.socios.add(deportistaAgregado);
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipoDeEvento, String nombreDeEvento) {
		Evento nuevoEvento = new Evento(tipoDeEvento);
		this.competencias.put(nombreDeEvento, nuevoEvento);
	}

	public Integer inscribirEnEvento(String nombreDeEvento, Deportista aInscribir) throws NoEstaPreparado {
		Integer numeroDeInscripcion = null;
		Evento deseado = competencias.get(nombreDeEvento);

		switch (deseado.getTipo()) {

		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:

			numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			break;

		case DUATLON:
			if (aInscribir instanceof ICiclista) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			} else {
				throw new NoEstaPreparado("Debe ser ciclista");
			}
			break;
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (aInscribir instanceof INadador) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			} else {
				throw new NoEstaPreparado("Debe ser nadador");
			}
			break;

		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			if (aInscribir instanceof INadador && aInscribir instanceof ICiclista) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			} else {
				throw new NoEstaPreparado("Debe ser nadador y ciclista");
			}
			break;
		}
		return numeroDeInscripcion;
	}
}
