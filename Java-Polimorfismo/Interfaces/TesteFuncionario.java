
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente nick = new Gerente();
		nick.setNome("Nicolas Caseiro");
		nick.setCpf("99988877766");
		nick.setSalario(10000.00);
		
		System.out.println(nick.getNome());
		System.out.println(nick.getBonificacao());
				
	}

}
