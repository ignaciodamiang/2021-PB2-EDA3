package ar.edu.unlam.pb2.eva03;

public class Deportista {

	private Integer nroDeSocio;
	private String nombreDeportista;

	public Deportista (Integer nroDeSocio, String nombreDeportista) {
		this.nroDeSocio=nroDeSocio;
		this.nombreDeportista=nombreDeportista;
	}

	public Integer getNumeroDeSocio() {
		return nroDeSocio;
	}


	public String getNombreDeportista() {
		return nombreDeportista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDeSocio == null) ? 0 : nroDeSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		if (nroDeSocio == null) {
			if (other.nroDeSocio != null)
				return false;
		} else if (!nroDeSocio.equals(other.nroDeSocio))
			return false;
		return true;
	}
}
