import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Ubicacion> ubicaciones;

    }

    public Main (){
        Map Ubicaciones = new HashMap<>();

        Ubicacion ubicacion0 = new Ubicacion(0, "Estás sentado en la clase de programación");
        Ubicacion ubicacion1 = new Ubicacion(1,"Estás en la cima de una montaña");
        Ubicacion ubicacion2 = new Ubicacion(2,"Estás bañándote en la playa");
        Ubicacion ubicacion3 = new Ubicacion(3,"Estás dentro de un edificio muy alto");
        Ubicacion ubicacion4 = new Ubicacion(4,"Estás de pie en un puente");
        Ubicacion ubicacion5 = new Ubicacion(5,"Estás en un bosque");

        Ubicaciones.put(0, ubicacion0);
        Ubicaciones.put(1, ubicacion1);
        Ubicaciones.put(2, ubicacion2);
        Ubicaciones.put(3, ubicacion3);
        Ubicaciones.put(4, ubicacion4);
        Ubicaciones.put(5, ubicacion5);


        //MONTAÑA
        ubicacion1.addExit("S", 1);
        ubicacion1.addExit("E", 2);
        ubicacion1.addExit("O", 3);
        ubicacion1.addExit("Q", 4);
        ubicacion1.addExit("N", 5);

        //PLAYA
        ubicacion2.addExit("S", 1);
        ubicacion2.addExit("E", 2);
        ubicacion2.addExit("O", 3);
        ubicacion2.addExit("Q", 4);
        ubicacion2.addExit("N", 5);

        //EDIFICIO
        ubicacion3.addExit("S", 1);
        ubicacion3.addExit("E", 2);
        ubicacion3.addExit("O", 3);
        ubicacion3.addExit("Q", 4);
        ubicacion3.addExit("N", 5);

        //PUENTE
        ubicacion4.addExit("S", 1);
        ubicacion4.addExit("E", 2);
        ubicacion4.addExit("O", 3);
        ubicacion4.addExit("N", 5);
        ubicacion4.addExit("Q", 0);

        //BOSQUE
        ubicacion5.addExit("S", 1);
        ubicacion5.addExit("E", 2);
        ubicacion5.addExit("O", 3);
        ubicacion5.addExit("N", 5);
        ubicacion5.addExit("Q", 0);

    }

    Scanner scanner = new Scanner(System.in);


    public void mostrarUbicaciones() {
        for (Map.Entry<Integer, Ubicacion>entry : exists) {
            System.out.println("ID: " + entry.getKey() + " Descripción:s " + entry.getValue().getDescripcion());
            System.out.println("Salidas: " + entry.getValue().getExits());
            System.out.println();
        }
    }


    do{
        System.out.println();
        System.out.println();





    }while
}