import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Map<Itens, Integer> carrinhoDeCompras = new HashMap<>();

    public static void main(String[] args) {
        boolean loop = true;
        while (true) {
            criaMenu();
            adicionaItem();

            System.out.println("Entre <s> para adicionar mais um item.");
            String novaConsulta = input.nextLine();
            if (!novaConsulta.equalsIgnoreCase("s")) break;
        }
        input.close();
        imprimeCarrinho();
    }

    public static void criaMenu() {
        System.out.println("""
                ========================================
                ===        LOJA KABUUUUUMMMMMM       ===
                ========================================
                """);
        System.out.println("Entre com o número de um item para inserir no carrinho de compras: ");

        for (Itens item : Itens.values()) {
            System.out.println((item.ordinal() + 1) + " - " + item.getNome());
        }

    }

    public static void adicionaItem() {
        try {
            System.out.print("\n> ");
            final var itemEscolhido = input.nextInt();
            Itens produto = Itens.values()[itemEscolhido - 1];

            System.out.printf("%nO item %s no valor de R$ %.2f. será adicionado ao carrinho de compras%n%n", produto.getNome(), produto.getValor());
            System.out.println("Entre com a quantidade: ");
            final var quantidade = input.nextInt();

            carrinhoDeCompras.merge(produto, quantidade, Integer::sum);

            System.out.printf("%nAdicionado %d itens do tipo %s ao carrinho de compras%n%n", quantidade, produto.getNome());

        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.printf("""
                    \u001B[31m
                                            
                    >>> Deve informar um número inteiro entre 1 e %d! <<<
                                           
                    \u001B[0m""", Itens.values().length);
        }
        input.nextLine();
    }

    public static void imprimeCarrinho() {
        System.out.println("""
                *****************************************
                *** Fechamento do Carrinho de Compras ***
                *****************************************
                """);

        var numDoItem = 0;
        System.out.println("--------------------------------------------------------------");
        System.out.printf("| %-4s | %-20s | %-8s | %-3s | %-11s |%n",
                "Item", "Produto", "Val/Un", "Qtd", "Valor Total");
        System.out.println("--------------------------------------------------------------");

        for (Itens produto : carrinhoDeCompras.keySet()) {
            numDoItem++;
            System.out.printf("|  %03d | %-20s | %8.2f | %3d | %11.2f |%n",
                    numDoItem,
                    produto.getNome(),
                    produto.getValor(),
                    carrinhoDeCompras.get(produto),
                    produto.getValor() * carrinhoDeCompras.get(produto)
            );
        }
        System.out.println("--------------------------------------------------------------");

        System.out.printf("%nValor total do carrinho: R$ %.2f%n%n", carrinhoDeCompras
                .keySet()
                .stream()
                .map(produto -> produto.getValor() * carrinhoDeCompras.get(produto))
                .reduce(0f, Float::sum));

        System.out.printf("Total de produtos no carrinho: %d%n%n", carrinhoDeCompras
                .values()
                .stream()
                .reduce(0, Integer::sum));
    }

}
