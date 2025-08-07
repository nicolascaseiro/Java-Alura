
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nick = new Funcionario();
		nick.setNome("Nicolas Caseiro");
		nick.setCpf("99988877766");
		nick.setSalario(10000.00);
		
		System.out.println(nick.getNome());
		System.out.println(nick.getBonificacao());
				
	}

}
