public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoNicolas = new Conta();
		System.out.println(contaDoNicolas.saldo);

		contaDoNicolas.titular = new Cliente();
		System.out.println(contaDoNicolas.titular);

		contaDoNicolas.titular.nome = "Nicolas";
		System.out.println(contaDoNicolas.titular.nome);

	}
}
