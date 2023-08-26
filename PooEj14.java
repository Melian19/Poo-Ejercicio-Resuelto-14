import java.util.Scanner;

public class PooEj14 {
    public static void main(String[] args) {
        //datos de entrada
        System.out.println("Ingrese el importe de ventas del primer departamento: ");
        Scanner entrada = new Scanner(System.in);
        int ventas1 = entrada.nextInt(); //ventas del departamento 1
        System.out.println("Ingrese el importe de ventas del segundo departamento: ");
        Scanner entrada2 = new Scanner(System.in);
        int ventas2 = entrada2.nextInt(); //ventas del departamento 2
        System.out.println("Ingrese el importe de ventas del tercer departamento: ");
        Scanner entrada3 = new Scanner(System.in);
        int ventas3 = entrada3.nextInt(); //ventas del departamento 1
        System.out.println("Ingrese el salario de los trabajadores: ");
        Scanner entrada4 = new Scanner(System.in);
        int salario = entrada4.nextInt(); //salario

        //proceso
        double salario1,salario2, salario3 = 0;
        int ventasTotales = ventas1+ventas2+ventas3;
        double metaVentas = ventasTotales * 0.33; // Porcentaje equivalente al 33%
        if (ventas1 > metaVentas){
            salario1 = salario + (salario*0.2);
        }else{
            salario1 = salario;
        }
        if (ventas2 > metaVentas){
            salario2 = salario + (salario*0.2);
        }else{
            salario2 = salario;
        }
        if (ventas3 > metaVentas){
            salario3 = salario + (salario*0.2);
        }else{
            salario3 = salario;
        }

        //datos salida
        System.out.println("Salario vendedores departamento 1: "+salario1+"\nSalario vendedores departamento 2: "+salario2+"\nSalario vendedores departamento 3: "+salario3);
    }
}