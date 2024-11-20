import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos números al usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Operadores Aritméticos
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (numero2 != 0) ? (double) numero1 / numero2 : 0; // División segura
        int modulo = numero1 % numero2;

        // Mostrar resultados de operaciones aritméticas
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }
        System.out.println("Módulo (resto de la división): " + modulo);

        // Operadores de comparación
        System.out.println("¿Es el primer número mayor que el segundo? " + (numero1 > numero2));
        System.out.println("¿Es el primer número menor que el segundo? " + (numero1 < numero2));
        System.out.println("¿Son los dos números iguales? " + (numero1 == numero2));
        System.out.println("¿El primer número es diferente al segundo? " + (numero1 != numero2));

        // Operadores lógicos
        boolean esMayorYPositivo = (numero1 > numero2) && (numero1 > 0);
        boolean esMenorOIgual = (numero1 <= numero2) || (numero1 == 0);
        boolean esNoPositivo = !(numero1 > 0);

        System.out.println("¿El primer número es mayor que el segundo y positivo? " + esMayorYPositivo);
        System.out.println("¿El primer número es menor o igual que el segundo o igual a 0? " + esMenorOIgual);
        System.out.println("¿El primer número no es positivo? " + esNoPositivo);

        scanner.close();
    }
}
