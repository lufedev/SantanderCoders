import java.util.Scanner;

public class MainSepararNome {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String frase = sc1.nextLine();
        String str;
        String[] fraseArray = frase.split(" ");
        for (int i = 0; i < fraseArray.length; i++) {

            str = '!'+ fraseArray[i];
            System.out.print(str + ' ');
        }
    }
}
