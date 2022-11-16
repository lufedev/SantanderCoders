//https://github.com/lufedev/SantanderCoders

import java.util.Scanner;

public class MainVoto {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);


            System.out.print("Digite sua idade: ");
            String entrada = sc1.nextLine();
            Integer idade = Integer.parseInt(entrada);

            String voto = idade > 0 && idade < 15 ? "Sem direito a votar"
                    : idade > 15 && idade < 18 ? "Voto Facultativo"
                    : idade > 17 && idade < 71? "Voto Obrigatório"
                    : idade > 70 ? "Voto Facultativo" : "Idade Inválida" ;

            System.out.println(voto);

    }
}

