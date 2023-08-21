import java.util.Scanner;
public class DivisionJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int modulo, division;

        System.out.println("Ingrese el dividendo: ");
        int divis = sc.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divid = sc.nextInt();

        modulo = divis % divid;
        division = divis / divid;

        System.out.println("el residuo es: " + modulo);
        System.out.println("el resultado de la división es: " + division);

        if (modulo == 0) {
            System.out.println("La división es exacta.");
        }
        else {
            System.out.println("La división NO es exacta.");
        }
    }
}