
import java.util.Scanner;
public class CaixaEletronico {

    public static void main(String[] args) throws Exception {
        TerminalDoBanco terminal = new TerminalDoBanco();     
        Scanner leitor = new Scanner(System.in);

        
        while(true){
            terminal.boasVindas();
            leitor.nextInt();

            leitor.close();
            return;
        }
       

    }
}

