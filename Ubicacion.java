import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    protected int id;
    protected String descripcion;

    Map<String,Integer> exits;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.exits = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit (String direccion, int idUbicacion){
        exits.put(direccion, idUbicacion);
    }

    public void Salidas(){
        for (Map.Entry<String, Integer> entradaMapa: exits.entrySet()) {
            System.out.print(entradaMapa.getKey()+" ");
        }
    }


    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", exits=" + exits +
                '}';
    }


}
