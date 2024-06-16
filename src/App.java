import java.util.Scanner;
import java.util.InputMismatchException;


public class App {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        ZapataCesar sn = new ZapataCesar();
        ZapataCesar sc = new ZapataCesar();
        ZapataCesar sf = new ZapataCesar();
        ZapataCesar ar = new ZapataCesar();
        
        int terminos      = validacionTermino(scan);
        int caracteres    = validacionCaracteres(scan);
        int niveles       = validacionNivel(scan);
        int tamano        = validacionTamano(scan);
        char caracter     = validacionCaracter(scan);

        sn.zcSN9(terminos);
        sn.zcSN10(terminos);
        sn.zcSN12(terminos);

        sc.zcSC8(caracteres);
        sc.zcSC9(caracteres);

        sf.zcF9(niveles);
        sf.zcF10(niveles);
        sf.zcF11(niveles);

        ar.zcA1();
        ar.zcA2(tamano, caracter);
        ar.zcA3();
        ar.zcA4();
        ar.zcA5();

        scan.close();
    }

    private static int validacionTermino(Scanner scan){
        int terminos = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el numero de terminos para su serie: ");
            try {
                terminos = scan.nextInt();
                if (terminos > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingrese un numero entero no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un numero.");
                scan.next(); 
            }
        }
        return terminos;
    }
    
    private static int validacionCaracteres(Scanner scan){
        int caracteres = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el numero de caracteres para su serie: ");
            try {
                caracteres = scan.nextInt();
                if (caracteres > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingrese un numero entero no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un numero.");
                scan.next(); 
            }
        }
        return caracteres;
    }

    private static int validacionNivel(Scanner scan){
        int niveles = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el numero de niveles para su figura: ");
            try {
                niveles = scan.nextInt();
                if (niveles > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingrese un numero entero no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un numero.");
                scan.next(); 
            }
        }
        return niveles;
    }

    private static int validacionTamano(Scanner scan){
        int tamano = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el numero de tamano para su matriz: ");
            try {
                tamano = scan.nextInt();
                if (tamano > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingrese un numero entero no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un numero.");
                scan.next(); 
            }
        }
        return tamano;
    }

    private static char validacionCaracter(Scanner scan) {
        String caracter = "";
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el caracter especial para la impresion del nombre: ");
            caracter = scan.next();
            if (caracter.length() == 1) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, ingrese un solo caracter.");
            }
        }
        return caracter.charAt(0);
    }

}

