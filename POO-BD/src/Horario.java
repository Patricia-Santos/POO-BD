import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Horario {

	@Id
	Date data;
	Time horario;
	

	Boolean verifica;

	@ManyToOne
	@JoinColumn(name = "id_c")
	Cliente c;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public Boolean getVerifica() {
		return verifica;
	}

	public void setVerifica(Boolean verifica) {
		this.verifica = verifica;
	}

	

	

	public Horario(Date data, Time horario, Boolean verifica) {
		super();
		this.data = data;
		this.horario = horario;
		this.verifica = verifica;
	}

}