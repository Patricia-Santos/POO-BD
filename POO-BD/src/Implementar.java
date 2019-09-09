import java.sql.Time;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Horario agendar(Time Horario, String Servico) throws HorarioInvalidoException, ServicoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelar(Time Horario, String nome, long tel, String Servico)
			throws HorarioInvalidoException, ServicoInvalidoException, NomeInvalidoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Servico verifica(Time Horario) throws HorarioInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profissionais addProfissionais(String nome, long tel) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		//DAO<Profissionais> dao = new DAO<Profissionais>();

		//Profissionais p = new Profissionais();
		//p.setNome(nome);
		//p.setTel(tel);
		//dao.save(p);

		return null;
	}

	@Override
	public Profissionais removeProfissionais(String nome, long tel) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		 
				
		
		
		
		return null;
	}

}
