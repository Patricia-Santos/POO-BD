import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Cliente implements Identificavel  {
	
	@Id
	private Integer id;
	private String nome;
	
	@ManyToMany
	@JoinTable(
			name="Cliente_servico",
			joinColumns = @JoinColumn(name = "Cliente_id"),
			inverseJoinColumns = @JoinColumn(name = "Servico_id")
			
			)
	Set<Servico> servico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Servico> getServico() {
		return servico;
	}

	public void setServico(Set<Servico> servico) {
		this.servico = servico;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (servico == null) {
			if (other.servico != null)
				return false;
		} else if (!servico.equals(other.servico))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", servico=" + servico + "]";
	}

	public Cliente(Integer id, String nome, Set<Servico> servico) {
		super();
		this.id = id;
		this.nome = nome;
		this.servico = servico;
	}

	
	

}