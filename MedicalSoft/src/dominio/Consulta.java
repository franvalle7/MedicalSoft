package dominio;

public class Consulta {
	private Paciente paciente;
	private String horaCita, motivo;
	
	public Consulta(Paciente paciente, String horaCita, String motivo) {
		super();
		this.paciente = paciente;
		this.horaCita = horaCita;
		this.motivo = motivo;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getHoraCita() {
		return horaCita;
	}
	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
