import java.util.Scanner;
import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al convertidor de monedas");
        System.out.println("*********************************");

        while (true){
            System.out.println("1) Dolar =>> Peso chileno");
            System.out.println("2) Peso Chileno =>> Dolar");
            System.out.println("3) Dolar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso Argentino");
            System.out.println("6) Peso Argentino =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Eliga una opcion:");
            System.out.println("*********************************");
            int opcion = Integer.valueOf(lectura.nextLine());
            ConsultaConvertidor conver = new ConsultaConvertidor();

            if (opcion==1){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion = conver.realizarConversion("USD", "CLP");
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}
            else if (opcion==2){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion = conver.realizarConversion("CLP","USD");
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}
            else if (opcion==3){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion = conver.realizarConversion("USD", "BRL" );
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}
            else if (opcion==4){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion =conver.realizarConversion("BRL", "USD" );
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}
            else if (opcion==5){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion = conver.realizarConversion("USD", "ARS");
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}

            else if (opcion==6){
                Scanner cantidad= new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double canti = Double.valueOf(cantidad.nextLine());
                Conversion conversion = conver.realizarConversion("ARS", "USD");
                System.out.println("El valor de " + canti + " " + conversion.base_code() + " corresponde a el valor de " +
                        conversion.conversion_rate() * canti + " " + conversion.target_code());}
            else if (opcion==7){
                System.out.println("Gracias por ocupar el convertidor");
                break;}

    }}
}