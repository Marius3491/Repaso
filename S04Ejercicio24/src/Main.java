import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");

        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();

        System.out.print("Cuantos dias ha estado de viaje visitando clientes? ");
        int dias_visita = sc.nextInt();

        System.out.print("Introduzca su estado civil: ");
        int estado_civil = sc.nextInt();

        double sueldo_base = 0;

        switch(cargo){
            case 1:
                sueldo_base=950;
                break;
            case 2:
                sueldo_base=1200;
                break;
            case 3:
                sueldo_base=1600;
                break;
            default:
                System.out.println("No ha elegido correctamente. ");
        }
        double sueldo_dia = dias_visita * 30;

        double sueldo_bruto = sueldo_dia + sueldo_base;

        double irpf = 0;

        if(estado_civil == 1){
            irpf = 25;
        } else if(estado_civil == 2){
            irpf = 20;
        } else{
            System.out.println("No ha elegido correctamente el estado civil");
        }

        double cuantia_irpf = (sueldo_bruto * irpf) /100;

        System.out.println("----------------------------------");
        System.out.println("| Sueldo base "+sueldo_base+"             |");
        System.out.println("| Dietas ("+dias_visita+" viajes) "+sueldo_dia+"        |");
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo bruto "+sueldo_bruto+"            |");
        System.out.println("| Retención IRPF ("+irpf+" %) "+cuantia_irpf+"  |");
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo neto "+(sueldo_bruto-cuantia_irpf)+"             |");
        System.out.println("----------------------------------");
    }
}