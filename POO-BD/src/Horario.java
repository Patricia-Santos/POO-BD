import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Horario implements Identificavel {

	@Id
	@GeneratedValue(generator = "horario_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "horario_seq", sequenceName = "horario_seq")

	Integer id;

	Tiposervico tipo;

	Boolean verifica;

	@ManyToOne
	@JoinColumn(name = "id_c")
	Cliente c;

	Calendar calendario;

	public Calendar getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}

	public Tiposervico getTipo() {
		return tipo;
	}

	public void setTipo(Tiposervico tipo) {
		this.tipo = tipo;
	}

	public Boolean getVerifica() {
		return verifica;
	}

	public void setVerifica(Boolean verifica) {
		this.verifica = verifica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

}