package tiposprimitivos;

/*
Notas de estudos sobre os tipos primitivos do Java.
Tipos primitivos são providos pela linguagem ativamente
*/
public class TiposPrimitivosNotasEstudos {
    public static void main(String[] args) {
        // Caraceres ou characters
        char PrimeiraLetraDoNome = 'T';
        char PrimeiraLetraDoNomeASCII = 43;

        System.out.println(PrimeiraLetraDoNome);
        System.out.println(PrimeiraLetraDoNomeASCII);

        // Inteiros ou Integers

        byte nota = 10; // -128 até 127
        short itensComprados = 2; //  -32768 até 32767
        int quantidadeEstoque = 23366; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 1232131241232131212L; // 19 digitos 
        

        // tipos decimmais
        float peso = 1.6f; // 6 - 7 casas decimais
        double preco = 24.99; // aproximadamente 15 casas decimais

        // Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false; 
          }
}
