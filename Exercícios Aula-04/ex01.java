package Exercicio_aula04;

public class ex01 {
    public static void main(String[] args) {

        String[] resultado_vetor = {
                "Idade Inválida" ,"Sem direito a votar","Voto Facultativo",
                "Voto Facultativo","Voto Obrigatório","Voto Obrigatório",
                "Voto Obrigatório","Voto Obrigatório","Voto Obrigatório",
                "Voto Obrigatório","Voto Obrigatório","Voto Facultativo",
                "Voto Facultativo","Voto Facultativo"
        };
        String[] falhas = new String[resultado_vetor.length];

        int[] idade_vetor = {0, 10,16,17,18 ,20, 30 , 40 ,50 , 60, 70 ,80 ,90 ,100};

        int invalido = 0;
        int sem_direito = 0;
        int facultativo = 0;
        int obrigatorio = 0;
        int total_falhas = 0;


        boolean[] success = new boolean[idade_vetor.length];
        for (int i = 0; i < idade_vetor.length ; i++) {

            if (idade_vetor[i] > 0 && idade_vetor[i] < 15){
                sem_direito = sem_direito + 1;
                if("Sem direito a votar".equals(resultado_vetor[i])){

                    success[i] = true;
                }
                else {
                    falhas[i] = "Teste " + (i + 1) + "\nResultado: " +"\""+resultado_vetor[i]+"\"" + "\nCorreto: \"Sem direito a votar\"" ;
                }
            }
            else if ((idade_vetor[i] > 15 && idade_vetor[i] < 18) || idade_vetor[i] > 70 ){

                facultativo = facultativo + 1;

                if("Voto Facultativo".equals(resultado_vetor[i])){
                    success[i] = true;
                }
                else {
                    falhas[i] = "Teste " + (i + 1)+ "\nResultado: " +"\""+resultado_vetor[i]+"\"" + "\nCorreto: \"Voto Facultativo\"" ;
                }
            }
            else if (idade_vetor[i] > 17 ) {

                obrigatorio = obrigatorio + 1;

                if("Voto Obrigatório".equals(resultado_vetor[i])){
                    success[i] = true;
                }
                else {
                    falhas[i] = "Teste " + (i + 1) + "\nResultado: " +"\""+resultado_vetor[i]+"\"" + "\nCorreto: \"Voto Obrigatório\"" ;
                }

            }
            else {
                invalido = invalido + 1;

                if("Idade Inválida".equals(resultado_vetor[i])){
                    success[i] = true;
                }
                else {
                    falhas[i] = "Teste " + (i + 1) + "\nResultado: " +"\""+resultado_vetor[i]+"\"" + "\nCorreto: \"Idade Inválida\"" ;
                }
            }

            if (success[i]){
                System.out.printf("Teste %d - Sucesso \n", i  + 1);
                success[i] = false;
            }
            else {
                System.out.printf("Teste %d - Falha \n", i + 1);
                total_falhas = total_falhas + 1;
            }
        }

        System.out.println("=======================================================================");

        if (total_falhas > 0) {
            System.out.printf("Os seguintes testes falharam: \n\n");
            for (int i = 0; i < falhas.length; i++) {
                if (falhas[i] != null) {
                    System.out.printf("%s \n\n",falhas[i]);
                }
            }
            System.out.printf("Total de falhas: %d \n\n", total_falhas );
        }
        else {
            System.out.println("Testes executados com sucesso");
        }
        /*
            Eu fiquei em dúvida se o total devia desconsiderar o valor caso a array fosse inválido,
            portanto eu assumi que mesmo sendo inválido, como o código faz a validação, o total estará
            devidamente corrigido.
         */
        System.out.println("=======================================================================");
        System.out.printf(" %d casos \"Voto inválido\"\n",invalido);
        System.out.printf(" %d casos \"Sem direito a votar\"\n",sem_direito);
        System.out.printf(" %d casos \"Voto facultativo\"\n",facultativo);
        System.out.printf(" %d casos \"Voto obrigatório\"\n",obrigatorio);

    }
}
