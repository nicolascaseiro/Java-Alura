public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 18;
        int quantidadePessoas = 3;

        if (idade >= 18) {

            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem-vindo");
        } else {
            if (quantidadePessoas >= 2) {
            	System.out.println("Você não tem 18, mas pode entrar, " 
            			+ "pois está acompanhado");
            } else {

                System.out.println("Infelizmente voce nao pode entrar");
            }

        }
    }
}
