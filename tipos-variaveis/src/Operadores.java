public class Operadores {
    public static void main(String[] args) {
         String nomeCompleto = "LINGUAGEM" + "JAVA";

         int numero = 5;
         //numero = - numero;

         //System.out.println(numero);

         //numero = numero * -1;

         //System.out.println(numero);

         //x repetição
         numero ++; 

         System.out.println(numero);

    
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

          int a, b;

          a = 5;
          b = 6;
          //String resultado = "";
          //if(a==b)
            // resultado = "Verdadeiro";
          //else
            // resultado = "Falso";
          String resultado = a==b ? "Verdadeiro" : "Falso";
             System.out.println(resultado);

//RELACIONAIS

  String nomeUm = "LARISSA";
  String nomeDois = "LARISSA";

  System.out.println(nomeUm == nomeDois);

  int numero1 = 1;
  int numero2 = 2;

  boolean simNao = numero1 == numero2;

  System.out.println("numeroUm é igual a numeroDois ? " + simNao);

  simNao = numero1 != numero2;

  System.out.println("numeroUm é diferente a numeroDois ? " + simNao);   

  simNao = numero1 > numero2;

  System.out.println("numeroUm é maior a numeroDois ? " + simNao);
         

//LÓGICOS

boolean condicao1 = true;

boolean condicao2 = false;

if (condicao1 && condicao2){
    System.out.println("Uma das condições são verdadeiras");
}
if (condicao1 || condicao2){
    System.out.println("As duas condições são verdadeiras");
}
    System.out.println("Fim");

}
}
