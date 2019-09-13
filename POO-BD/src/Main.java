
public class Main {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("Winchester");
		DAO<Cliente> dao = new DAO<Cliente>();
		dao.save(c);
	}

}
