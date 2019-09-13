import java.sql.Time;
import java.util.Calendar;

public interface Interface {

	
	public Cliente addCliente(String nome, long tel) throws NomeInvalidoException, TelInvalidoException;
	
	public Cliente removeCliente (String nome, long tel) throws TelInvalidoException;
	
	public boolean cancelar (Calendar horario, Cliente cliente, long tel, Tiposervico tipo) throws HorarioInvalidoException, ServicoInvalidoException, NomeInvalidoException;
	
	public boolean verifica (Calendar horario) throws HorarioInvalidoException;
	
	
	public Profissionais addProfissionais (String nome, long tel ) throws NomeInvalidoException;
	
	public Profissionais removeProfissionais (String nome, long tel ) throws NomeInvalidoException;

	public Horario agendar(Cliente cliente, Calendar horario, Tiposervico tipo)
			throws HorarioInvalidoException;
	
	
}
