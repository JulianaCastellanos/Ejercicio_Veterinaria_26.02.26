import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        //Actividad veterinaria
        //Juliana Castellanos Vanegas

        //inicio
        Macota m1 = new Macota();
        System.out.println("Bienvenido a la veterinaria");
        System.out.println("");
        System.out.println("Ingrese el nombre de su mascota:");
        m1.setNombre(teclado.next());
        System.out.println("Ingrese la edad de su mascota:");
        m1.setEdad(teclado.nextInt());
        System.out.println("¿Cuánto pesa su mascota? (en kilogramos)");
        m1.setPeso(teclado.nextDouble());
        System.out.println("¿Su mascota está saludable? 1. Sí  2. No");
        int s = teclado.nextInt();
        if (s == 1) {
            m1.setSaludable(true);
        } else if (s == 2) {
            m1.setSaludable(false);
        } else {
            System.out.println("Error");
        }

        //menu

        int op;

        do {
            System.out.println("------- Menu --------");
            System.out.println("");
            System.out.println("1. Modificar edad");
            System.out.println("2. Modificar peso");
            System.out.println("3. Cambiar estado de salud");
            System.out.println("4. Mostrar información");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese el número de la opción que desea realizar");
            op = teclado.nextInt();

            if (op==1) {
                System.out.println("1. Cambiar edad");
                System.out.println("2. Cumplió años");
                int opc = teclado.nextInt();
                if (opc==1) {
                    System.out.println("Ingrese el nuevo valor de la edad");
                    m1.setEdad(teclado.nextInt());
                } else if (opc == 2) {
                    System.out.println("Felíz cumple");
                    m1.cumplirAnios();
                } else {
                    System.out.println("Opción invalida");
                }
            } else if (op ==2) {
                System.out.println("1. Aumentar peso");
                System.out.println("2. Disminuir peso");
                int opci = teclado.nextInt();
                if (opci == 1){
                    System.out.println("¿Cuánto aumentó?");
                    double peso = teclado.nextDouble();
                    m1.engordar(peso);
                } else if (opci == 2) {
                    System.out.println("¿Cuánto peso perdió?");
                    double peso2 = teclado.nextDouble();
                    m1.adelgazar(peso2);
                } else {
                    System.out.println("Error");
                }
            } else if (op==3) {
                System.out.println("Ingrese el estado de la mascota");
                System.out.println("1. Sano");
                System.out.println("2. Enfermo");
                System.out.println("3. recuperado");
                int estado = teclado.nextInt();
                if (estado == 1) {
                    m1.setSaludable(true);
                } else if (estado == 2 ) {
                    m1.enfermar(true);
                } else if (estado == 3) {
                    m1.recuperarSalud(true);
                } else {
                    System.out.println("error");
                }
            } else if (op==4) {
                m1.mostrarFicha();
            } else if (op ==5) {
                System.out.println("Bye bye :)");
            }else {
                System.out.println("Error, opción invalida");
            }
        } while (op !=5);

    }
}