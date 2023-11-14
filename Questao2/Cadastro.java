
public class Cadastro {

    private Conta[] contas;
    private int qtdCadastradas;

    public Cadastro(int capacidade) {

        this.contas = new Conta[capacidade];
        this.qtdCadastradas = 0;
    }

    public boolean cadastrar(Conta novaConta) {

        if (qtdCadastradas < contas.length) {
            contas[qtdCadastradas] = novaConta;
            qtdCadastradas++;
            return true;
        }
        return false;
    }

    public Conta procurar(int numeroConta) {

        for (int i = 0; i < qtdCadastradas; i++) {

            if (contas[i] != null && contas[i].getNumero() == numeroConta) {

                return contas[i];
            }
        }
        return null;
    }

    public boolean excluir(int numeroConta) {

        for (int i = 0; i < qtdCadastradas; i++) {

            if (contas[i] != null && contas[i].getNumero() == numeroConta) {

                return removerConta(i);
            }
        }
        return false;
    }

    private boolean removerConta(int indice) {

        if (indice >= 0 && indice < qtdCadastradas) {

            contas[indice] = contas[qtdCadastradas - 1];
            contas[qtdCadastradas - 1] = null;
            qtdCadastradas--;
            return true;
        }
        return false;
    }

    public int qtdCadastradas() {
        
        return qtdCadastradas;
    }
}