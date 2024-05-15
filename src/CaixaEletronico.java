
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) throws Exception {
        TerminalDoBanco terminal = new TerminalDoBanco();     
        Scanner leitor = new Scanner(System.in);
        Cliente clienteNoCaixa = new Cliente();
        int opcaoDoCaixa;
        double valores; 

        while(true){
            terminal.boasVindas();
                    
                System.out.println("Digite o número da sua conta: ");
                String numeroDoClienteAtivo = leitor.next();
                clienteNoCaixa = terminal.checarCliente(numeroDoClienteAtivo);
                System.out.println("1 - Sacar dinheiro; 2 - Depositar dinheiro; 3 - Saldo atual; 4 - Finalizar");
                opcaoDoCaixa = leitor.nextInt();
                switch (opcaoDoCaixa) {
                    case 1 -> {
                        System.out.println("Quanto você quer sacar?: ");
                        valores = leitor.nextDouble(); 
                        clienteNoCaixa.sacarDinheiro(valores);
                    }
                    case 2 -> {
                        System.out.println("Quanto você quer depositar?: ");
                        valores = leitor.nextDouble(); 
                        clienteNoCaixa.depositarDinheiro(valores);
                    }
                    case 3 -> {
                        System.out.println("Seu saldo atual é: R$" + clienteNoCaixa.getSaldo());
                    }
                    case 4 -> {
                        return;
                    }
                    default -> throw new AssertionError();
                }
                leitor.close();

            return;
        }
       

    }
}

