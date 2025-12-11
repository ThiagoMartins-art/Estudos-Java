package Casting;

public class CastingNotasEstudo {

    /*
    casting: operação de transformar um tipo de dados em outro.

    Widening Casting Vs Narrowing Casting
    */

    public static void main(String[] args) {
        
        // Widening Casting (Impliscito)

        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        //System.out.println(variavelGrande);
        //System.out.println(variavelInt);


        // Narrowing Casting (Explicito)

           long variavelLong = 8759947;
           int variavelInt2 = (int) variavelLong;
           //System.out.println(variavelInt2);


        // Operações de divisão entre numeros inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = (float) numero1 / numero2;
        System.out.println(resultadoDivisao);


    }
}
