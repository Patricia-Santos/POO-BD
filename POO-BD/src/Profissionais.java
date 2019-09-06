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
	
	@OneToMany(mappedBy="p")
	private Set<Servico> servicos;
	
	

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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_servico == null) {
			if (other.id_servico != null)
				return false;
		} else if (!id_servico.equals(other.id_servico))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profissionais [id=" + id + ", id_servico=" + id_servico + ", tipo=" + tipo + "]";
	}

	public Profissionais(Integer id, Integer id_servico, String tipo) {
		super();
		this.id = id;
		this.id_servico = id_servico;
		this.tipo = tipo;
	}

}