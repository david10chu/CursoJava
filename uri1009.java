    import java.util.Scanner;
    
    public class uri1009{   
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);

            String nome;
            double salario,vendas,total;

            nome    = teclado.nextString();
            salario = teclado.nextDouble();
            vendas  = teclado.nextDouble();
            
            total = (vendas + (vendas*0.15) + salario);

            System.out.printf("TOTAL = R$ %.2f\n", total);
            

        }
    }