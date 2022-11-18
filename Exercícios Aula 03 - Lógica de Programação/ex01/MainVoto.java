//https://github.com/lufedev/SantanderCoders
import java.util.Scanner;

public class MainVoto {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        while (true){
            System.out.print("Digite sua idade: ");
            String entrada = sc1.nextLine();
            Integer idade = Integer.parseInt(entrada);

           if (idade > 0 && idade < 15){
               System.out.println("Sem direito a votar");
               break;

           } else if ((idade > 15 && idade < 18) || idade > 70 ){
               System.out.println("Voto facultativo");
               break;

           } else if (idade > 17 ) {
               System.out.println("Voto obrigatório");
               break;

           } else {
               System.out.println("Valor inválido tente novamente");
           }
        }
    }
}


