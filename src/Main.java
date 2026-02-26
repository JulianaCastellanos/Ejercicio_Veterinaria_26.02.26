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
        System.out.println("Ingrese el nombre de su mascota");
        m1.setNombre(teclado.next());
        System.out.println("Ingrese la edad de su mascota");
        m1.setEdad(teclado.nextInt());
        System.out.println("¿Cuánto pesa su mascota");
        m1.setPeso(teclado.nextDouble());
        System.out.println("¿Su mascota está saludable? si/no");
        String s = teclado.next();
        if (s == "si") {
            m1.setSaludable(true);
        } else if (s == "no") {
            m1.setSaludable(false);
        } else {
            System.out.println("Error");
        }

        //menu

        System.out.println("------- Menu --------");
        System.out.println("");
        System.out.println("1. Modificar edad");
        System.out.println("2. Modificar peso");
        System.out.println("3. Cambiar estado de salud");
        System.out.println("");
        System.out.println("Ingrese el número de la opción que desea realizar");
        int op = teclado.nextInt();


        switch (op) {
            case 1:
                System.out.println("1. Cambiar edad");
                System.out.println("2. Cumplió años");
                int opc = teclado.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el nuevo valor de la edad");
                        m1.setEdad(teclado.nextInt());
                        break;
                    case 2:
                        System.out.println("Felíz cumple");
                        m1.cumplirAnios();
                        break;
                    default:
                        System.out.println("Error");
                }
            case 2:
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
                break;
            case 3:
                System.out.println("1. Sano");
                System.out.println("2. Enfermó");
                System.out.println("3. Se recuperó");
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
        }









    }
}