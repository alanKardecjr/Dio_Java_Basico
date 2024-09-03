//Importando o pacote Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        
        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Menssagem de entrada
        System.out.println(" ");
        System.out.println("+-------------------------------------+");
        System.out.println("|*Seja bem vindo ao terminal do Banco*|");
        System.out.println("| ***Por favor insira seus dados***   |");
        System.out.println("+-------------------------------------+");
        System.out.println(" ");

        //Coletando os dados do usuario
        System.out.println("Digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite sua conta: ");
        int conta = scanner.nextInt();



    }

}

                    