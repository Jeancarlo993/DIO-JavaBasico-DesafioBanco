
/**
 *
 * @author jean_
 */
public class Cliente {
    private int numeroDaConta;
    private String agencia;
    private String nomeDoCliente;
    private double saldo;

    public void sacarDinheiro(double saque){
        saldo = saldo - saque;
        System.out.println("Você sacou " + saque + ". Seu saldo agora é R$" + saldo);
    }
    public void depositarDinheiro(double deposito){
        saldo = saldo + deposito;
        System.out.println("Você depositou " + deposito + ". Seu saldo agora é R$" + saldo);
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNomeDoCliente(){
        return nomeDoCliente;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setNomeDoCliente(String nomeDoCliente){
        this.nomeDoCliente = nomeDoCliente;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
