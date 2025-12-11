package Io;

import java.util.Scanner;

/*
 Entrada e saida (i/o) de dados no Java

 Entrada de dados: ler dados digitados pelo usuario.

Saida de dados: Escrever dados para o usiario

*/

public class IoNotasEstudo {

    public static void main(String[] args) {
        // leiitura de dados de entrada
        System.out.println("digite um numero");
        Scanner scanner = new Scanner(System.in);

        
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        
        scanner.close();


        // Saida de dados

        System.out.printf( " O numero digitado foi %d", valorDigitado);
    }
}