import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = sc.next();
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugada2 = sc.next();
        if(jugada1.equals(jugada2)){
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch(jugada1) {
                case "piedra":
                    if(jugada2.equals("tijera")){
                        ganador = 1;
                    }
                    break;

                case "papel":
                    if(jugada2.equals("piedra")){
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if(jugada2.equals("papel")){
                        ganador = 1;
                    }
                    break;
                default:
            }
            System.out.println("Gana el jugador "+ganador);
        }
    }
}