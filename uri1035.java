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
    
    public class uri1035{   
        public static void main (String args[]){
            
            Scanner teclado = new Scanner(System.in);

            int a, b, c, d;

            a = teclado.nextInt();
            b = teclado.nextInt();
            c = teclado.nextInt();
            d = teclado.nextInt();

            if( (b > c) && (d > a) && (c+d > a+b) && (c>0 && d>0) && (a % 2 == 0)){
                System.out.println("valores aceitos");
            }
            else{
                System.out.println("valores nao aceitos");
            }
        }
    }