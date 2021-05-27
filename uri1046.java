    import java.util.Scanner;
    
    public class uri1041{   
        public static void main (String args[]){
            
            Scanner teclado = new Scanner(System.in);

            int horaini = teclado.nextDouble();
            int horafim = teclado.nextDouble();

            int duracao = teclado.nextDouble();

            if (horaini < horafim){
                duracao = horafim - horaini;
                System.out.println("O JOGO DUROU" + duracao + "HORAS(S)");
            }
            else{
                duracao = 24 - horaini + horafim;
                System.out.println("O JOGO DUROU" + duracao + "HORAS(S)");
                
            }
        }
    }