/* 
Leia 4 valores inteiros A, B, C e D. A seguir, 
(1)se B for maior do que C e 
(2)se D for maior do que A, 
(3)e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for 
par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
Entrada
Quatro números inteiros A, B, C e D.
Saída
Mostre a respectiva mensagem após a validação dos
*/
    
    import java.util.Scanner;
    
    public class uri1038{   
        public static void main (String args[]){
            
            Scanner teclado = new Scanner(System.in);

            int codigo = teclado.nextInt();
            int quantidade = teclado.nextInt();
            double total;

            if(codigo == 1){
                total = quantidade * 4.0;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            else if(codigo == 2){
                total = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if(codigo == 3){
                total = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if(codigo == 4 ){
                total = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if(codigo == 5){
                total = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f\n",total);
            }

        }                 
   
    }