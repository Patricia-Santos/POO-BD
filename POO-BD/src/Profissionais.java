import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Profissionais implements Identificavel{
	
	@Id
	@GeneratedValue(generator="profissionais_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="profissionais_seq", sequenceName="profissionais_seq")
	private Integer id;
	private String nome;
	private Integer id_servico;
	private String tipo;
	private long tel;

	@OneToMany(mappedBy = "p")
	private Set<Servico> servicos;

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (servicos == null) {
			if (other.servicos != null)
				return false;
		} else if (!servicos.equals(other.servicos))
			return false;
		if (tel != other.tel)
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
		return "Profissionais [id=" + id + ", nome=" + nome + ", id_servico=" + id_servico + ", tipo=" + tipo + ", tel="
				+ tel + ", servicos=" + servicos + "]";
	}

	


}