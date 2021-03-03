package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	private Integer kilometrosEntrenados;

	public Triatleta(Integer nroDeSocio, String nombreDeportista, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(nroDeSocio, nombreDeportista);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoDeBicicleta=tipo;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

	public Integer getKilometrosEntrenados() {
		return kilometrosEntrenados;
	}

	
}
