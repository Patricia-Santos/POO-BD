import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Implementar implements Interface {

	@Override
	public Cliente addCliente(String nome, long tel) throws NomeInvalidoException, TelInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente e = new Cliente();
		e.setNome(nome);
		e.setTel(tel);
		dao.save(e);

		return e;
	}

	@Override
	public Cliente removeCliente(String nome, long tel) throws TelInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente e = new Cliente();
		e.setNome(nome);
		e.setTel(tel);

		dao.remove(e);

		return e;
	}

	@Override
	public Horario agendar(Cliente cliente, Calendar horario, Tiposervico tipo) throws HorarioInvalidoException {
		Calendar hoje = new GregorianCalendar();
		if (hoje.after(horario)) {
			throw new HorarioInvalidoException();
		}
		DAO<Horario> dao = new DAO<Horario>();
		Horario c = new Horario();
		Cliente cl = new Cliente();

		c.setC(cl);
		c.setCalendario(hoje);
		c.setTipo(tipo);

		dao.save(c);

		return c;
	}

	@Override
	public boolean cancelar(Calendar horario, Cliente cliente, long tel, Tiposervico tipo) throws HorarioInvalidoException, ServicoInvalidoException, NomeInvalidoException {
		Calendar hoje = new GregorianCalendar();
		if (hoje.after(horario)) {
			throw new HorarioInvalidoException();
		}
		DAO<Horario> dao = new DAO<Horario>();
		Horario c = new Horario();
		Cliente cl = new Cliente();
		
		c.setC(cl);
		c.setCalendario(hoje);
		c.setTipo(tipo);
		
		dao.remove(c);
	
		return true;
	}

	@Override
	public boolean verifica(Calendar horario) throws HorarioInvalidoException {
		Calendar hoje = new GregorianCalendar();
		if (hoje.after(horario)) {
			throw new HorarioInvalidoException();
		}
		DAO<Horario> dao = new DAO<Horario>();
		Horario c = new Horario();
		
		if (c != null) {
			System.out.println(false);
		}
		

		return true;
	}

	@Override
	public Profissionais addProfissionais(String nome, long tel) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Profissionais> dao = new DAO<Profissionais>();

		Profissionais p = new Profissionais();
		p.setNome(nome);
		p.setTel(tel);
		dao.save(p);

		return null;
	}

	@Override
	public Profissionais removeProfissionais(String nome, long tel) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Profissionais> dao = new DAO<Profissionais>();

		Profissionais p = new Profissionais();
		p.setNome(nome);
		p.setTel(tel);

		dao.remove(p);

		return p;
	}

}
