
public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro(3);

        Conta conta1 = new Conta(1, 10000.0, "Maria Eduarda VA");
        Conta conta2 = new Conta(2, 2.0, "MAria Eduarda IGT");
        Conta conta3 = new Conta(3, 370.0, "Marcos W.");

        System.out.println("\n---------- QUESTÃO 2 - CADASTRO DE CONTAS - BANCO ----------\n");

        System.out.println("CADASTRO:\n");

        System.out.println("Cadastrar conta1: " + cadastro.cadastrar(conta1));
        System.out.println("Cadastrar conta2: " + cadastro.cadastrar(conta2));
        System.out.println("Cadastrar conta3: " + cadastro.cadastrar(conta3));
        Conta conta4 = new Conta(4, 4.0, "Vicencya N.");
        System.out.println("Cadastrar conta4: " + cadastro.cadastrar(conta4)+ "\n");

        System.out.println("PROCURAR:\n");

        System.out.println("Procurar conta 2: " + cadastro.procurar(1));
        System.out.println("Procurar conta 5: " + cadastro.procurar(10) + "\n");

        System.out.println("CONTAS CADASTRADAS:\n");

        System.out.println("Numero de contas cadastradas: " + cadastro.qtdCadastradas()+ "\n");

        System.out.println("EXLUIR:\n");

        System.out.println("Excluir conta 2: " + cadastro.excluir(2));
        System.out.println("Excluir conta 5: " + cadastro.excluir(5)+ "\n");

        System.out.println("CONTAS CADASTRADAS DEPOIS DA EXCLUSÃO:\n");

        System.out.println("Numero de contas cadastradas: " + cadastro.qtdCadastradas()+ "\n");
    }
}