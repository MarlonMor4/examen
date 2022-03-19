package co.edu.cesde;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int pedidos, num, f, total, num1, propina;
        int perros = 0, hamburguesas = 0, chorizos = 0, salchipapas = 0;
        double descuento, pagar, totalpagar;
        Scanner examen = new Scanner(System.in);
        num1 = 1;
        while (num1 == 1) {
            System.out.println("            Bienevenido a Muerte lenta");

            System.out.println("cantidad de pedidos: ");
            num = examen.nextInt();

            for (f = 1; f <= num; f++) {

                System.out.println("            Menú");
                System.out.println("                         ");
                System.out.println("        (1)Perros");
                System.out.println("        (2)Hamburguesas");
                System.out.println("        (3)Salchipapas");
                System.out.println("        (4)Chorizos");
                System.out.println("    Digite  numero del pedido");
                pedidos = examen.nextInt();
                if (pedidos == 1) {
                    perros = perros + 1;
                } else if (pedidos == 2) {
                    hamburguesas = hamburguesas + 1;
                } else if (pedidos == 3) {
                    salchipapas = salchipapas + 1;
                } else if (pedidos == 4) {
                    chorizos = chorizos + 1;
                }

            }
            total = (chorizos * 7000) + (salchipapas * 6000) + (hamburguesas * 10000) + (perros * 8000);

            if (total > 20000) {

                descuento = total + (total * 0.10);
                System.out.println("Se le realizó un descuento por compras superiores a 20000 pesos");

                System.out.println("Desea incluir propina 1.si y 2 no:");
                propina = examen.nextInt();
                if (propina == 1) {
                    totalpagar = descuento - (descuento * 0.10);

                    System.out.println("Total pagar:" + totalpagar);
                } else {
                    System.out.println("Total pagar=" + total);
                }
            } else if (total < 20000) {


                System.out.println("Desea incluir propina 1.si y 2 no:");
                propina = examen.nextInt();
                if (propina == 1) {
                    pagar = total + (total * 0.10);
                    System.out.println("Total pagar:" + pagar);
                } else {
                    System.out.println("Total pagar=" + total);
                }

            }

            System.out.println("Desea repetir el programa 1.si y 2.no");
            num1 = examen.nextInt();

        }

    }
}