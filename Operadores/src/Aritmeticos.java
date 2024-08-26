public class Aritmeticos {
    public static void main(String[] args) throws Exception {
        // +(adição), - (subtração), * (multiplicação) e / (divisão);

        String concatenacao = "?";

            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);
            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);
            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);
            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);
            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);

        double soma = 10.5 + 22.3;
        int subtracao = 50 - 25;
        int multiplicacao = 3*9;
        int divisao = 50/2;
        int modulo = 18 % 3;
        double resultado = (50 * 7 ) + (20/4);

        String nomeCompleto = "LINGUAGEM " +  "JAVA";

        System.out.println(nomeCompleto);

    }
}
