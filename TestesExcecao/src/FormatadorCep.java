//Importando o pacote Scanner
import java.util.Scanner; 

public class FormatadorCep {
    
    public static void main(String[] args) {
        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in);

      try{
        //Coletando os dados do usuario
        System.out.print("Digite seu CEP:");
        String cep = scanner.next();
        //Verificando as exceções
        String cepFormatado = formatarCep(cep); 
        System.out.println(cepFormatado); 
    } catch (CepInvalidoException e) {
        System.out.println("o cep precisa conter oito digitos.");
    }

}

static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
        throw new CepInvalidoException();

        //Simulador de cep
        return "Digitação correta";

    }   

       
}
