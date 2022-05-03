import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int num1=0, num2=0, soma=0;
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite um número para iniciar a contagem:");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um número para finalizar a contagem:");
        num2 = Integer.parseInt(leitor.nextLine());
    
        for (int i=num1;i<=num2;i++){
            if (i % 2 != 0){
                System.out.println(i);
                soma += i;
            }
        }
        System.out.printf("O total da soma dos números ímpares de %d a %d é: %d", num1, num2, soma);
    
        leitor.close();
    }
}
