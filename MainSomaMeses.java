import java.util.Scanner;

public class MainSomaMeses {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = sc1.nextLine();
        String[] fraseArray = frase.split(",");
        int total = 0;

        String[] somaTotal = new String[fraseArray.length];

        for (String s : fraseArray) {
            System.out.println(s.trim());
            String[] valores = s.split(":");
            total += Integer.parseInt(valores[1].trim());
        }
        System.out.println("Total: " + total);

    }
}
