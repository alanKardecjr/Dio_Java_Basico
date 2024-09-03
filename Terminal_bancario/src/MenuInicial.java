//Importando o pacote Scanner
import java.util.Scanner;

public class MenuInicial {
    
    public static void main(String[] args, boolean opcao) {

        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in);

        do { 
        //Imprimindo menu de escolha
        System.out.println(" ");
        System.out.println("+-------------------------------------+");
        System.out.println("|*Seja bem vindo ao terminal do Banco*|");
        System.out.println("|***  Escolha o serviço desejavel  ***|");
        System.out.println("+-------------------------------------+");
        System.out.println("*                                     *");
        System.out.println("+-------------------------------------+");
        System.out.println("|*****        1 - Saldo          *****|");
        System.out.println("|*****        2 - Deposito       *****|");
        System.out.println("|*****        3 - Saque          *****|");
        System.out.println("|*****        4 - Sair           *****|");
        System.out.println("+-------------------------------------+");
        System.out.println(" ");

        //Coletando a opção
        System.out.println("Digite sua opção: ");
        int opcao = scanner.nextInt();        

        //Atribuindo a opção correspondente a ação necessária
    switch (opcao) {
        case 1:
        System.out.println("|*****        1 - Saldo          *****|");
           break;
        case 2:
        System.out.println("|*****        2 - Deposito       *****|");
           break;
        case 3:
        System.out.println("|*****        3 - Saque          *****|");
           break;
        case 4:
           System.out.println("+--------------------------------------+");
           System.out.println("|*Obrigado por utilizar nosso terminal*|");
           System.out.println("+--------------------------------------+");  
           break;
        default:
           System.out.println("*****   Opção inválida.   *****");
             }

         } while ( opcao != 4);

           

    }
    
}
