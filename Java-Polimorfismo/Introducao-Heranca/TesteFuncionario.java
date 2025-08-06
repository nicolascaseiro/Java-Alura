
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nick = new Funcionario();
		nick.setNome("Nicolas Caseiro");
		nick.setCpf("999.888.777-66");
		nick.setSalario(10000);
		
		System.out.println(nick.getNome());
		System.out.println(nick.getBonificacao());
				
	}

}
