import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Profissionais {
	@Id
	Integer id;
	Integer id_servico;
	String tipo;
	long tel;

	@OneToMany(mappedBy = "p")
	private Set<Servico> servicos;

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public Profissionais(long tel) {
		super();
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_servico() {
		return id_servico;
	}

	public void setId_servico(Integer id_servico) {
		this.id_servico = id_servico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissionais other = (Profissionais) obj;
		if (tel != other.tel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profissionais [tel=" + tel + "]";
	}

	public Profissionais(Integer id, Integer id_servico, String tipo) {
		super();
		this.id = id;
		this.id_servico = id_servico;
		this.tipo = tipo;
	}

}