import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa");

        System.out.print("Número de entradas: ");
        int entradas = Integer.parseInt(s.nextLine());

        System.out.print("Día de la semana: ");
        String dia = s.nextLine();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        boolean tarjeta = (s.nextLine()).equals("s");

        int entrada_individual = entradas;
        double precio_individual = 8;
        int entrada_pareja = 0;
        double total;
        double descuento = 0;
        double aPagar;

        switch (dia) {
            case "miercoles":
                precio_individual = 5;
            case "jueves":
                entrada_pareja = entradas / 2;
                entrada_individual = entradas % 2;
            default:
        }

        total = precio_individual * entrada_individual;
        total += 11 * entrada_pareja;

        if (tarjeta) {
            descuento = total * 0.1;
        }

        aPagar = total - descuento;

        System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");
        if (entrada_pareja > 0) {
            System.out.println("Entradas de pareja "+entrada_pareja);
            System.out.println("Precio por entrada de pareja "+11.0);
        }
        if (entrada_individual > 0) {
            System.out.println("Entradas individuales "+entrada_individual);
            System.out.println("Precio por entrada individual "+precio_individual);
        }
        System.out.println("Total "+total);
        System.out.println("Descuento "+descuento);
        System.out.println("A pagar "+aPagar);
    }
}