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
	@JoinColumn (name = "id_c")
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horario other = (Horario) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (verifica == null) {
			if (other.verifica != null)
				return false;
		} else if (!verifica.equals(other.verifica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Horario [data=" + data + ", horario=" + horario + ", verifica=" + verifica + "]";
	}

	public Horario(Date data, Time horario, Boolean verifica) {
		super();
		this.data = data;
		this.horario = horario;
		this.verifica = verifica;
	}

}