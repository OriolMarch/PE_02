
import java.util.Scanner;

public class PE_02OriolMarch {
    public static void main(String[] args) { 

  Scanner sc = new Scanner(System.in);

      
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
            case 1: {
                // Porta principal
                System.out.println("\nHas entrat per la porta principal.");
                
                // Decisió 2 ( true porta principal)
                
                System.out.println("Decisió 2: Vas cap a la planta superior o soterrani?");
                System.out.println("1) Planta superior");
                System.out.println("2) Soterrani");
                System.out.print("Opció: ");
                int d2_principal = sc.nextInt();

                switch (d2_principal) {
                    case 1: {
                        // Planta superior
                        System.out.println("\nPlanta superior: Veus una persona vella i amb una forma molt estranya.");
                    
                        // Decisió 3 (planta superior)
                        
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
                        
                        // Decisió 3 (soterrani)
    
                        System.out.println("Decisió 3: Afrontar-te amb ell o escapar?");
                        System.out.println("1) Afrontar");
                        System.out.println("2) Escapar");
                        System.out.print("Opció: ");
                        int d3_soterrani = sc.nextInt();

                        if (d3_soterrani == 1) {
                            if (teBiblia) {
                                System.out.println("\nAfrontar amb Bíblia: Tens una creu a la Bíblia, fas un exorcisme i desapareix. (Final Feliç)");
                            } else {
                                System.out.println("\nAfrontar sense Bíblia: Vences l'home, però mors per hemorràgia. (Final Tràgic)");
                            }
                        } else {
                            System.out.println("\nEscapar: Penses que escapas, però en pujar hi ha el dimoni i et posseeix. (Final Dolent)");
                        }
                        break;
                    }
                    default: {
                        System.out.println("\nOpció no vàlida a la Decisió 2.");
                        break;
                    }
                }
                break;
            }
            case 2: {
                // Porta de darrere
                System.out.println("\nHas entrat pel darrere i trobes una porta-portal a un altre univers.");
                
                // Decisió 2 (porta darrere)
                
                System.out.println("Decisió 2: Què fas?");
                System.out.println("1) Entrar al portal");
                System.out.println("2) Tornar a la porta principal");
                System.out.print("Opció: ");
                int d2_darrere = sc.nextInt();

                if (d2_darrere == 1) {
                    if (teBiblia) {
                        System.out.println("\nEntrar amb la Bíblia: Realitat paral·lela perfecta: família, diners, motos, gossos, mansió … (Final Fantàstic Bo)");
                    } else {
                        System.out.println("\nEntrar sense Bíblia: Realitat paral·lela d'infern i sofriment etern. (Final Fantàstic Tràgic)");
                    }
                } else if (d2_darrere == 2) {
                    System.out.println("\nPorta principal: No la pots obrir, s'ha travat; la família mor, però tornes a casa viu. (Final Fantàstic Neutre)");
                } else {
                    System.out.println("\nOpció no vàlida a la Decisió 2.");
                }
                break;
            }
            default: {
                System.out.println("Opció no vàlida a la Decisió 1.");
                break;
            }
        }

        System.out.println("Fi de la història by Oriol March Vernet.");
        sc.close();
        }
    }
    
