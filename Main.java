import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public static void main(String[] args) {
        Ubicacion ubicacion0 = new Ubicacion(0, "Estás sentado en la clase de programación");
        Ubicacion ubicacion1 = new Ubicacion(1, "Estás en la cima de una montaña");
        Ubicacion ubicacion2 = new Ubicacion(2, "Estás bañándote en la playa");
        Ubicacion ubicacion3 = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        Ubicacion ubicacion4 = new Ubicacion(4, "Estás de pie en un puente");
        Ubicacion ubicacion5 = new Ubicacion(5, "Estás en un bosque");

        ubicaciones.put(0, ubicacion0);
        ubicaciones.put(1, ubicacion1);
        ubicaciones.put(2, ubicacion2);
        ubicaciones.put(3, ubicacion3);
        ubicaciones.put(4, ubicacion4);
        ubicaciones.put(5, ubicacion5);


        ubicacion1.addExit("S", 1);
        ubicacion1.addExit("E", 2);
        ubicacion1.addExit("O", 3);
        ubicacion1.addExit("Q", 4);
        ubicacion1.addExit("N", 5);


        ubicacion2.addExit("S", 1);
        ubicacion2.addExit("E", 2);
        ubicacion2.addExit("O", 3);
        ubicacion2.addExit("Q", 4);
        ubicacion2.addExit("N", 5);


        ubicacion3.addExit("S", 1);
        ubicacion3.addExit("E", 2);
        ubicacion3.addExit("O", 3);
        ubicacion3.addExit("Q", 4);
        ubicacion3.addExit("N", 5);


        ubicacion4.addExit("S", 1);
        ubicacion4.addExit("E", 2);
        ubicacion4.addExit("O", 3);
        ubicacion4.addExit("N", 5);
        ubicacion4.addExit("Q", 0);


        ubicacion5.addExit("S", 1);
        ubicacion5.addExit("E", 2);
        ubicacion5.addExit("O", 3);
        ubicacion5.addExit("N", 5);
        ubicacion5.addExit("Q", 0);



        Scanner scanner = new Scanner(System.in);
        String respuesta;
        int cont = 1;


            do {
                System.out.println(ubicaciones.get(cont).getDescripcion());
                System.out.print("Tus salidas válidas son: ");
                ubicaciones.get(cont).Salidas();
                respuesta = scanner.next();
                scanner.nextLine();
                System.out.println();

                if (respuesta.equals("Q")) {
                    System.out.println("Estás sentado en la clase de programación");
                    System.out.println("Saliendo");
                    respuesta = "Q";
                } else {
                    if (ubicaciones.get(cont).getExits().get(respuesta) != null) {
                        cont = ubicaciones.get(cont).getExits().get(respuesta);
                        ;
                        System.out.println(ubicaciones.get(cont).getDescripcion());
                        System.out.println("Puedes elegir:");


                    } else {
                        System.out.println("No puedes ");
                    }


                }


            } while (!respuesta.equals("Q")) ;


    }

}