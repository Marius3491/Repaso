import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double precio_nata=0;
    double precio_nombre=0;
    double precio=0;
    double total;
    String tipo_choco ="";
    String sabor;
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = sc.next();
        switch(sabor){
            case "manzana":
                precio = 18.00;
                break;
            case "fresa":
                precio = 16.00;
                break;
            case "chocolate":
                System.out.print("Que tipo de chocolate quiere? (negro o blanco) ");
                tipo_choco = sc.next();
             if(tipo_choco.equals("negro")){
                 precio =14.00;
                }else if(tipo_choco.equals("blanco")){
                 precio=15.00;
            }
             break;
            default:
        }
        System.out.print("¿Quiere nata? (si o no): ");
        boolean extra_nata = sc.next().equals("si");

        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        boolean extra_nombre = sc.next().equals("si");

        System.out.print("Tarta de " + sabor);

        if (sabor.equals("chocolate")) {
            System.out.print(" " + tipo_choco);
        }

        System.out.print(" : "+ precio+" €\n");

        if (extra_nata) {
            precio_nata = 2.50;
            System.out.println("Con nata: "+ precio_nata+" €");
        }

        if (extra_nombre) {
            precio_nombre = 2.75;
            System.out.println("Con nombre: "+precio_nombre+" €");
        }
        total=precio + precio_nata + precio_nombre;
        System.out.println("Total "+total+" €");
    }
}