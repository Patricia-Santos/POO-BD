import java.sql.Time;

public interface Interface {

	
	public Cliente AddCliente(String nome, long tel) throws NomeInvalidoException, IdInvalidoException;
	
	public Cliente RemoveCliente (String nome, long tel) throws IdInvalidoException;
	
	public Horario Agendar (Time Horario, String Servico ) throws HorarioInvalidoException, ServicoInvalidoException;
	
	public boolean Cancelar (Time Horario, String nome, long tel, String Servico) throws HorarioInvalidoException, ServicoInvalidoException, NomeInvalidoException;
	
	public Servico Verifica (Time Horario) throws HorarioInvalidoException;
	
	
	public Profissionais AddProfissionais (String nome, long tel ) throws NomeInvalidoException;
	
	public Profissionais RemoveProfissionais (String nome, long tel ) throws NomeInvalidoException;
	
	
}
