package practicaLineUp.pojos;

public class Cancion {
    
    private int id;
    private String nombre;
    private float duracion;
    private String urlArchivo;

    public Cancion(int id, String nombre, float duracion, String urlArchivo) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.urlArchivo = urlArchivo;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public float getDuracion() {return duracion;}
    public String getUrlArchivo() {return urlArchivo;}

    public boolean setId(int id) {
        if(id>0) {
            this.id = id;
            return true;
        }else return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }else return false;
    }

    public boolean setDuracion(float duracion) {
        if(duracion>0) {
            this.duracion = duracion;
            return true;
        }else return false;
    }

    public boolean setUrlArchivo(String urlArchivo) {
        if(!urlArchivo.isEmpty()) {
            this.urlArchivo = urlArchivo;
            return true;
        }else return false;
    }
}
