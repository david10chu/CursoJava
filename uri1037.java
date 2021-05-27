    import java.util.Scanner;
    
    public class uri1037{   
        public static void main (String args[]){
            
            Scanner teclado = new Scanner(System.in);

            double valor = teclado.nextDouble();

            if(valor < 0 || valor > 100.00){
                System.out.println("Fora de intervalo");
            }
            else if(valor <= 25.00){
                System.out.println("Intervalo [0,25]");
            }
            else if(valor <= 50.00){
                System.out.println("Intervalo (25,50]");
            }
            else if (valor <= 100.00){
                System.out.println("Intervalo (75,100]");
            }
        }
    }