import java.util.Scanner;
import ParametroInvalidoException.ParametroInvalidoException;


public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro valor");
        int value1 = scanner.nextInt();
        System.out.println("Digite o Segundo valor");
        int value2 = scanner.nextInt();

        try {
            contar(value1, value2);
        } catch (ParametroInvalidoException e) {
            System.err.println("O segundo parametro deve ser maior que o primeiro.");
            scanner.close();
            // e.printStackTrace();
            return;
        }

        scanner.close();


    }

    static void contar(int var1, int var2) throws ParametroInvalidoException{

        if (var1 > var2) {
            ParametroInvalidoException erro  = new ParametroInvalidoException();
            throw erro;
        }
        int interetator =  var2 - var1;

        for(int i = 1; i <= interetator; i++){
            System.out.println("O Contador está em: " + i);
        }
    }
}