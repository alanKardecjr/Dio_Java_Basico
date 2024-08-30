//Importando o pacote Scanner
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Coletando os dados do usuario
        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("*Bem vindo ao aplicativo para calcular o IMC*");  
        System.out.println("*********************************************");
        System.out.println("");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("");       
        System.out.println("*********************************************");
   
        //Imprimindo os dados obtidos pelo usuario 
        System.out.println("********* Seus dados coletados são: *********"); 
        System.out.println("*********************************************");
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Meu peso " + peso);
        System.out.println("Minha altura " + altura + " cm ");
                
        ////Calculando o IMC
        double imc = peso / (altura*altura);
        
                  if (imc <= 18.5) {
                    System.out.println("Sua Classificação é de Magreza");
                } else if (imc >= 18.55 && imc <= 24.9) {
                    System.out.println("Sua Classificação Está Dentro do Normal");
                } if (imc >= 25.0 && imc <= 29.9) {
                    System.out.println("Sua Classificação é de Sobrepeso I");
                } else if (imc >= 30.0 && imc <= 39.9) {
                    System.out.println("Sua Classificação é Obesidade II");
                } else if (imc >= 40.0 ) {
                    System.out.println("Sua Classificação é Obesidade Grave III");
                }
                System.out.println("Seu IMC é = " + imc);
                System.out.println("*********************************************");
                System.out.println("");
            }
        }


       



    


