import java.sql.Time;

public interface Interface {

	
	public Cliente addCliente(String nome, long tel) throws NomeInvalidoException, TelInvalidoException;
	
	public Cliente removeCliente (String nome, long tel) throws TelInvalidoException;
	
	public Horario agendar (Time Horario, String Servico ) throws HorarioInvalidoException, ServicoInvalidoException;
	
	public boolean cancelar (Time Horario, String nome, long tel, String Servico) throws HorarioInvalidoException, ServicoInvalidoException, NomeInvalidoException;
	
	public Servico verifica (Time Horario) throws HorarioInvalidoException;
	
	
	public Profissionais addProfissionais (String nome, long tel ) throws NomeInvalidoException;
	
	public Profissionais removeProfissionais (String nome, long tel ) throws NomeInvalidoException;
	
	
}
