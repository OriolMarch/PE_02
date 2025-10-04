
import java.util.Scanner;

public class PE_02OriolMarch {
    public static void main(String[] args) { 

Scanner sc = new Scanner(System.in);

      //Decisió 0
        System.out.println("Decisió 0: Que fas?");
        System.out.println("1) Agafar la Bíblia i entrar");
        System.out.println("2) Entrar directament");
        System.out.print("Opció: ");
        int d0 = sc.nextInt();

  boolean teBiblia;
        if (d0 == 1) {
            teBiblia = true;
        } else {
            teBiblia = false;
        }

        System.out.println("\nEstàs davant de la porta principal.");
    
               // Decisió 1
        
        System.out.println("Decisió 1: Entrar per la porta principal o per la porta de darrere?");
        System.out.println("1) Porta principal");
        System.out.println("2) Porta de darrere");
        System.out.print("Opció: ");
        int d1 = sc.nextInt();

                switch (d1) {
            case 1: {}
                // Porta principal
                System.out.println("\nHas entrat per la porta principal.");
                
                // Decisió 2 
                
                System.out.println("Decisió 2: Vas cap a la planta superior o soterrani?");
                System.out.println("1) Planta superior");
                System.out.println("2) Soterrani");
                System.out.print("Opció: ");
                int d2_principal = sc.nextInt();
    }
}
}