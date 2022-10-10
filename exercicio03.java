import java.util.Scanner;

public class exercicio03 {
    public static void main (String[]args) {
     int valA, valB, valSoma;
     Scanner ler = new Scanner (System.in);
     System.out.println("Entre com dois numeros para serem somados");
     valA = ler.nextInt();
     valB = ler.nextInt();
     valSoma = valA + valB;
     System.out.println("Valor da soma e " + valSoma);
    }
}
