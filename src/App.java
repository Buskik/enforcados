import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

         
       
         int playerX = 0;
         int playerY = 0;
         String[][] tabuleiro =  new String[10][10];

            tab(playerX, playerY, tabuleiro);
         
        


      
      
    }
    public static void tab(int x, int y, String[][] tabuleiro) {
        while(x < tabuleiro.length && y < tabuleiro[0].length){

        for (String[] strings : tabuleiro) {
            System.out.printf("══");
        }
        
        for(int i = 0; i < tabuleiro.length; i++){

                

            System.out.println();
            
            for(int j = 0; j <tabuleiro[i].length; j++){
                if (x == j && y == i){
                System.out.printf("@");
                System.out.printf("║");
                }else{
                    System.out.printf(" ");
                    System.out.printf("║");
                }
                
               
                
            }
            System.out.println("");
            for (String[] strings : tabuleiro) {
                System.out.printf("══");
            }
            
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Rodar dado");
        String p = scan.next();
       
        x += dado();
        if (x >= tabuleiro[0].length){
            x = 0;
            y++;
        }
    }
    }
    public static int dado() {
        Random random = new Random();
        int valor = random.nextInt(1,7);
        return valor;
    }
       
}

    

