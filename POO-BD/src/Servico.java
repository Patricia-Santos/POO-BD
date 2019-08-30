import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servico {
	@Id
	Integer id;
	String nome;
	String pagamento;
	double valor;
	Time tempo;
	Boolean realizado;
	
	@ManyToOne
	@JoinColumn (name = "id_p")
	Profissionais p;
	

	public Integer getId() {
		return id;
	}

	public Profissionais getP() {
		return p;
	}

	public void setP(Profissionais p) {
		this.p = p;
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

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Time getTempo() {
		return tempo;
	}

	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}

	public Boolean getRealizado() {
		return realizado;
	}

	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
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
		if (pagamento == null) {
			if (other.pagamento != null)
				return false;
		} else if (!pagamento.equals(other.pagamento))
			return false;
		if (realizado == null) {
			if (other.realizado != null)
				return false;
		} else if (!realizado.equals(other.realizado))
			return false;
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", nome=" + nome + ", pagamento=" + pagamento + ", valor=" + valor + ", tempo="
				+ tempo + ", realizado=" + realizado + "]";
	}

	public Servico(Integer id, String nome, String pagamento, double valor, Time tempo, Boolean realizado) {
		super();
		this.id = id;
		this.nome = nome;
		this.pagamento = pagamento;
		this.valor = valor;
		this.tempo = tempo;
		this.realizado = realizado;
	}

}