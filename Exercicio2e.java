    import java.util.Scanner;
    
    public class Exercicio2e{   
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);
    
            double baseg, basep, altura, area;

            System.out.println("por favor digite o valor do base menor");
            basep = teclado.nextDouble();

            System.out.println("por favor digite o valor da base maior");
            
            baseg = teclado.nextDouble();

            System.out.println("por favor digite o valor da altura");
            
            altura = teclado.nextDouble();

            area = (basep + baseg) * altura/2;

            System.out.println("A area do trapezio é " + area);

        }
    }
