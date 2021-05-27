    import java.util.Scanner;
    
    public class Exercicio2d{   
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
   
        double diagonal1, diagonal2, area;

        System.out.println("por favor digite o valor da diagonal 1");
        diagonal1 = teclado.nextDouble();

        System.out.println("por favor digite o valor da diagonal 2");
        
        diagonal2 = teclado.nextDouble();

        area = diagonal1 * diagonal2;

        System.out.println("A area é do losango é " + area);

        }
    }
