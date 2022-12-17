public class Tiposvariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //`Para não ter a possibilidade de mudar o valor, tem que colocar "final" no inicio e a variável em caixa alta

}
}
