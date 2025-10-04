
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

                switch (d2_principal) {
                    case 1: {
                        // Planta superior
                        System.out.println("\nPlanta superior: Veus una persona vella i amb una forma molt estranya.");
                    
                        // Decisió 3
                        
                        System.out.println("Decisió 3: L’ajudes o no l’ajudes?");
                        System.out.println("1) Ajudar");
                        System.out.println("2) No ajudar");
                        System.out.print("Opció: ");
                        int d3_superior = sc.nextInt();

                        if (d3_superior == 1) {
                            if (teBiblia) {
                                System.out.println("\nAmb Bíblia: És un esperit i no et posseeix. (Final Feliç)");
                            } else {
                                System.out.println("\nSense Bíblia: Et posseeix i mates a tota la família. (Final Tràgic)");
                            }
                        } else {
                            System.out.println("\nSense ajudar: Per la seva presència et suïcides amb la mateixa creu del penjoll. (Final Tràgic)");
                        }
                        break;
                    }
                    case 2: {
                        // Soterrani
                        System.out.println("\nSoterrani: Està tot fosc i hi ha un home amb una destral.");
    }

}
}
    }
}
