
package aula01;
public class conta {
    public String nomeBanco;
    public int numAgencia;
    private int numConta;
    private int senha;

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getSenha() {
        return senha;
    }
}
