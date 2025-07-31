public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoNicolas = new Conta(6646,969060);
		System.out.println(contaDoNicolas.getSaldo());

		contaDoNicolas.setTitular(new Cliente());
		System.out.println(contaDoNicolas.getTitular());

		contaDoNicolas.getTitular().setNome("Nicolas");
		System.out.println(contaDoNicolas.getTitular().getNome());

	}
}
