import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Identificavel {

	@Id
	private Integer id;
	private String nome;
	long tel;

	@ManyToMany
	@JoinTable(name = "Cliente_servico", joinColumns = @JoinColumn(name = "Cliente_id"), inverseJoinColumns = @JoinColumn(name = "Servico_id")

	)
	Set<Servico> servico;

	@OneToMany(mappedBy = "c" + "")
	private Set<Horario> horario;

	public Cliente(long tel) {
		super();
		this.tel = tel;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
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
		if (tel != other.tel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [tel=" + tel + "]";
	}

}