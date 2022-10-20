import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double medida;
        double precio_bandera;
        double precio_escudo = 2.5;
        double envio = 3.25;
        double precio_total;
        String men_escudo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        double alto = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        double ancho = sc.nextInt();
        System.out.print("Quiere escudo bordado? (s/n): ");
        String respuesta = sc.next();
        medida = alto*ancho;
        precio_bandera = alto*ancho/100;
        System.out.println(precio_bandera);
        if(respuesta.equals("s")){
            men_escudo = "Con escudo";
        }else{
            men_escudo = "Sin escudo";
            precio_escudo = 0.0;
        }

        System.out.println("Gracias. Aqui tienes el desglose de su compra");
        System.out.println("Bandera de "+medida+" cm2: "+precio_bandera);
        System.out.println(men_escudo+": "+precio_escudo);
        System.out.println("Gastos de envio: "+envio);
        precio_total = precio_bandera+precio_escudo+envio;
        System.out.println("Total: "+precio_total);

    }
}