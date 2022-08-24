import java.util.InputMismatchException;
import java.util.Scanner;
public class libros {
        public static void main(String[] args) {
            menu();
            String libros[][] = new String[100][3];  //tamaño 100, 3 tipos de datos
        }
        public static void menu(){
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
                            break;
                        case 2:
                            System.out.println("has seleccionado la opcion BUSCAR LIBRO");
                            break;
                        case 3:
                            System.out.println("has seleccionado la opcion MOSTRAR ESPACIOS USADOS");
                        case 4:
                            System.out.println("has seleccionado la opcion MOSTRAR ESPACIOS DISPONIBLES");
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

        public static String[][] agregarLIbro(String misLIbros[,String titulo,String autor,String editorial){

        }


    }

