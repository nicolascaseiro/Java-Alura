
public class Gerente extends Funcionario implements Autenticavel {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE")
		return super.getSalario();
	}

}
