    import java.util.Scanner;
    
    public class Exercicio2c{   
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
   
        double base, altura, area;

        System.out.println("por favor digite o valor do base");
        base = teclado.nextDouble();

        System.out.println("por favor digite o valor da altura");
        
        altura = teclado.nextDouble();

        area = base * altura/2;

        System.out.println("A area é do triangulo é " + area);

        }
    }
