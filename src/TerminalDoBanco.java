import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TerminalDoBanco {
    public void boasVindas(){
        System.out.println("Bem vindo ao Seu Banco!");        
    }
    public Cliente checarCliente(int agencia, String conta)  throws IOException{
        Cliente clienteNoTerminal = new Cliente();
        BufferedReader bancoDeDados = new BufferedReader(new FileReader("BancoDeDados.csv"));

        bancoDeDados.close();
        return clienteNoTerminal;
    }
}
