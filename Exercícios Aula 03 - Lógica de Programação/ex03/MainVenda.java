//https://github.com/lufedev/SantanderCoders

import java.util.Scanner;

public class MainVenda {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o ID do produto: ");
        String entrada = sc1.nextLine();
        Integer produto = Integer.parseInt(entrada);

        switch (produto){
            case(1):
                System.out.println("Coca-Cola - R$ 5");
                break;

            case(2):
                System.out.println("Coca-Cola 0 - R$ 4.50");
                break;

            case (3):
                System.out.println("Pepsi - R$ 4,40");
                break;

            case (4):
                System.out.println("Guaraná Antarctica - R$ 3,50");
                break;

            case (5):
                System.out.println("Fanta Laranja - R$ 4,23");
                break;

            case (6):
                System.out.println("Água - R$ 2,50");
                break;
        }

    }
}
