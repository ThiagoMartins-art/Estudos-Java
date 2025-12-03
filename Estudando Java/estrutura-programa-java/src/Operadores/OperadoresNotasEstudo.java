package Operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        // Operadores aritimeticos

    /*
    +: adição
    -: subtração
    *: multiplicação
    /: divisão
    %: Módulo
    ++: invremento
    --: decremento
    */
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
       // System.out.println("A soma é:" + soma);

        int numero3 = 3;
        int numero4 = 4;
        int subtração = numero4 - numero3;
        // System.out.println(subtração);

        double numero5 = 2.5;
        double numero6 = 6;
        double multiplicação = numero5 * numero6;
        //System.out.println(multiplicação);

        int numero7 = 7;
        int numero71 = 71;
        int divisao = numero71 / numero7;
        //System.out.println(divisao);

        int modulo = numero71 % numero7;
        //System.out.println(modulo);

        int contador = 0;
        contador++;
        contador++;
        //System.out.println(contador); 

        contador--;
        contador--;
        //System.out.println(contador);

        
        /*
        Operadores relacionais

        >: Maior que
        <: Menor que 
        >=: Maior ou igual que
        <=: Menor ou igual que
        ==: Igual a 
        !=: Diferente de
        */

        
        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean ehmaior = decimal2 > decimal1;
        //System.out.println(ehmaior);
        
       Boolean ehmenor = decimal2 > decimal1;

        //System.out.println(ehmenor);

        //System.out.println(decimal2 >= decimal1);

        //System.out.println(decimal2 <= decimal1);

        //System.out.println(decimal1 == decimal1);

        //System.out.println(decimal1 != decimal1);


        /*
        Operadores de atribuição

        =: Atribuição
        +=: Atribuição soma
        -=: Atribuição subtração
        *=: Atribuição multiplicação
        /=: Atribuição divisão
        %=: Atribuição módulo

        */

        int variavel = 1;
        //variavel += 4;
        //variavel -= 1;
        //variavel *= 5;
        //variavel /= -1;
        variavel %= 1;
        //System.out.println(variavel);

        /*
        Operadires lógicos

        &&: E / AND
        ||: OU / OR
        !: Negação / NOT

        */

        int valor1 =4;
        int valor2 =2;
        boolean expressaoAnd = valor1 < 10 && valor2 <2;
        //System.out.println(expressaoand);

         boolean expressaoOr= valor1 < 10 || valor2 <2;
        //System.out.println(expressaoOr);

        boolean expressaoNegada =  (2 < 1);
        System.out.println(!expressaoNegada);
    }
}

    }
}

