import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TerminalDoBanco {
    public void boasVindas(){
        System.out.println("Bem vindo ao Seu Banco!");        
    }

    public Cliente checarCliente(String conta)  throws IOException{
        Cliente clienteNoTerminal = new Cliente();
        String clienteNoBancoDeDados;
        String dadosDoCliente[];

        try (BufferedReader bancoDeDados = new BufferedReader(new FileReader("src/BancoDeDados.csv"))) {
            while((clienteNoBancoDeDados=bancoDeDados.readLine()) != null){
                dadosDoCliente = clienteNoBancoDeDados.split(",");
                if(dadosDoCliente[0].equals(conta)){
                    clienteNoTerminal.setNumeroDaConta(Integer.parseInt(dadosDoCliente[0]) );
                    clienteNoTerminal.setAgencia(dadosDoCliente[1]);
                    clienteNoTerminal.setNomeDoCliente(dadosDoCliente[2]);
                    clienteNoTerminal.setSaldo(Double.parseDouble(dadosDoCliente[3]));
                    System.out.println("Bem vindo " + clienteNoTerminal.getNomeDoCliente());
                    return clienteNoTerminal;
                }
            }        
        }
        System.out.println("Cliente não encontrado");
        return clienteNoTerminal;
    }



}
