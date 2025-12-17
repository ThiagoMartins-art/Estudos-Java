/*
Exercicio 1 

Dadas 3 notas, imprimir a média aritimetica do aluno.

1. ler 3 notas
2. calcular média
3. imprimir resultado


*/

import java.util.Scanner;

public class MediaAritimetica {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Digite as 3 notas do alono");
    double nota1 = scanner.nextDouble();
    double nota2 = scanner.nextDouble();
    double nota3 = scanner.nextDouble();

    scanner.close();

    Double MediaAritimetica = (nota1 + nota2 + nota3) / 3;
    System.out.printf("A média obtida foi %.2f", MediaAritimetica);


}

}
