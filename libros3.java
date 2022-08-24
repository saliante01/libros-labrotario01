import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class libros {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sn = new Scanner(System.in);


        boolean salir = false;
        int opcion;


        while (!salir) {

            //opciones
            System.out.println("1. AGREGAR LIBRO");
            System.out.println("2. BUSCAR LIBRO");
            System.out.println("3. MOSTRAR ESPACIOS USADOS");
            System.out.println("4. MOSTRAR ESPACIOS DISPONIBLES");
            System.out.println("5. MOSTRAR TODA LA COLECCIÓN");
            System.out.println("6. SALIR DEL MENU");

            try {


                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("has seleccionado la opcion AGREGAR LIBRO");
                        agregarLibro();
                        break;
                    case 2:
                        System.out.println("has seleccionado la opcion BUSCAR LIBRO");
                        break;
                    case 3:
                        System.out.println("has seleccionado la opcion MOSTRAR ESPACIOS USADOS");
                    case 4:
                        System.out.println("has seleccionado la opcion MOSTRAR ESPACIOS DISPONIBLES");
                        System.out.println("La cantidad de espacios es: ");
                        espacioVacios();
                        break;
                    case 5:
                        System.out.println("has seleccionado la opcion MOSTRAR TODA LA COLECCION");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 7");
                }


                //controla la excepcionn en caso de que se introduzca un valor no correcto
            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");


    }

    public static String[][] agregarLibro(String misLIbros, String titulo, String autor, String editorial) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese datos del libro,(titulo autor editorial)");
        String textoIngresado = sc.nextLine();
        String texto = textoIngresado;

        int tamaño = texto.length();
        int columnas = (int) Math.ceil((float) tamaño);
        String misLibros[][] = new String[100][3];  //tamaño 100, 3 tipos de datos

        for (int x = 0; x < misLibros.length; x++) {
            for (int y = 0; y < misLibros[x].length; y++) {
                if (y != misLIbros[x].length() - 1) ;
            }

        }
        return misLibros;
    }

    public static void imprimirColeccion(String mislibros) {
        System.out.println((agregarLibro())); //por terminar

    }

    //metodo para contar los espacios vacios de la matriz
    public static int espacioVacios() {
        agregarLibro();
        int cantidadDeEspacios = 0;
        for (int i = 0; i < agregarLibro().length(); i++) {
            if (agregarLibro().charAt(i) == ' ') cantidadDeEspacios++;
        }
     System.out.println("La cantidad de espacios es: " + cantidadDeEspacios);
        return cantidadDeEspacios;
    }
    public static void mostrarTotalDeLibros(String mislibros[]){}

    }






