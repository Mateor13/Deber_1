import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Videojuegos[] videojuego = new Videojuegos[5];

        Scanner entrada = new Scanner(System.in);
        int opcion, contador = 0;
        do {
            System.out.println("Menú de Videojuegos:");
            System.out.println("1. Ingresar la información de los 5 videojuegos\n2. Mostrar la información de los 5 videojuegos\n3. Modificar la información\n4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1){
                if (contador > 0){
                    System.out.println("Ya se ha ingresado la información de los videojuegos.\n");
                } else {
                    for (int i = 0; i < 5; i++) {
                        videojuego[i] = new Videojuegos();
                        System.out.println("\nIngrese la información del videojuego " + (i + 1) + ": ");
                        System.out.print("Ingrese el nombre del videojuego: ");
                        videojuego[i].setNombre(entrada.nextLine());
                        System.out.print("Ingrese el género del videojuego: ");
                        videojuego[i].setGenero(entrada.nextLine());
                        System.out.print("Ingrese el precio del videojuego: ");
                        videojuego[i].setPrecio(entrada.nextDouble());
                        System.out.print("Ingrese las horas estimadas del videojuego: ");
                        videojuego[i].setHorasEstimadas(entrada.nextInt());
                        System.out.print("Ingrese la calificación del videojuego: ");
                        videojuego[i].setCalificacion(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("Ingrese la plataforma del videojuego: ");
                        videojuego[i].setPlataforma(entrada.nextLine());
                        System.out.print("Ingrese el desarrollador del videojuego: ");
                        videojuego[i].setDesarrollador(entrada.nextLine());
                        System.out.print("Ingrese la fecha de lanzamiento del videojuego: ");
                        videojuego[i].setFechaLanzamiento(entrada.nextLine());
                        System.out.print("Ingrese la clasificación del videojuego: ");
                        videojuego[i].setClasificacion(entrada.nextLine());
                        System.out.print("Ingrese el modo de juego del videojuego: ");
                        videojuego[i].setModoJuego(entrada.nextLine());
                    }
                    System.out.println("Información de los videojuegos ingresada correctamente.\n");
                    contador++;
                }
            } else if (opcion == 2){
                if (contador == 0){
                    System.out.println("No se ha ingresado información de los videojuegos.\n");
                } else {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\nInformación del videojuego " + (i + 1) + ": ");
                        videojuego[i].mostrarDatos();
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                }
            } else if (opcion == 3) {
                if (contador == 0) {
                    System.out.println("No se ha ingresado información de los videojuegos.\n");
                } else {
                    System.out.println("\nVideojuegos registrados: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Videojuego #" + (i+1)+": ");
                        videojuego[i].mostrarNombre();
                        System.out.println(" ");
                    }
                    System.out.print("Ingrese el número del videojuego que desea modificar: ");
                    int num = entrada.nextInt();
                    entrada.nextLine();
                    if (num < 1 || num > 5) {
                        System.out.println("Número de videojuego no válido.\n");
                    } else {
                        System.out.println("\nInformación del videojuego " + num + ": ");
                        videojuego[num - 1].mostrarDatos();
                        System.out.println(" ");
                        System.out.println("¿Qué dato desea modificar?");
                        System.out.println("1. Nombre\n2. Género\n3. Precio\n4. Horas Estimadas\n5. Calificación\n6. Plataforma\n7. Desarrollador\n8. Fecha de Lanzamiento\n9. Clasificación\n10. Modo de Juego");
                        System.out.print("Ingrese una opción: ");
                        int opcion2 = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion2) {
                            case 1:
                                System.out.print("Ingrese el nuevo nombre: ");
                                videojuego[num - 1].setNombre(entrada.nextLine());
                                break;
                            case 2:
                                System.out.print("Ingrese el nuevo género: ");
                                videojuego[num - 1].setGenero(entrada.nextLine());
                                break;
                            case 3:
                                System.out.print("Ingrese el nuevo precio: ");
                                videojuego[num - 1].setPrecio(entrada.nextDouble());
                                break;
                            case 4:
                                System.out.print("Ingrese las nuevas horas estimadas: ");
                                videojuego[num - 1].setHorasEstimadas(entrada.nextInt());
                                break;
                            case 5:
                                System.out.print("Ingrese la nueva calificación: ");
                                videojuego[num - 1].setCalificacion(entrada.nextDouble());
                                break;
                            case 6:
                                System.out.print("Ingrese la nueva plataforma: ");
                                videojuego[num - 1].setPlataforma(entrada.nextLine());
                                break;
                            case 7:
                                System.out.print("Ingrese el nuevo desarrollador: ");
                                videojuego[num - 1].setDesarrollador(entrada.nextLine());
                                break;
                            case 8:
                                System.out.print("Ingrese la nueva fecha de lanzamiento: ");
                                videojuego[num - 1].setFechaLanzamiento(entrada.nextLine());
                                break;
                            case 9:
                                System.out.print("Ingrese la nueva clasificación: ");
                                videojuego[num - 1].setClasificacion(entrada.nextLine());
                                break;
                            case 10:
                                System.out.print("Ingrese el nuevo modo de juego: ");
                                videojuego[num - 1].setModoJuego(entrada.nextLine());
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("\nOpción no válida, intente de nuevo.\n");
            }
        } while (opcion != 4);
    }
}