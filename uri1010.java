    import java.util.Scanner;
    
    public class uri1010{   
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);

            double p1,p2,cod1,cod2,v1,v2,total;

            cod1 = teclado.nextDouble();
            p1   = teclado.nextDouble();
            v1   = teclado.nextDouble();

            cod2 = teclado.nextDouble();
            p2   = teclado.nextDouble();
            v2   = teclado.nextDouble();

            total = (p1*v1)+(p2*v2);

            System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
            

        }
    }