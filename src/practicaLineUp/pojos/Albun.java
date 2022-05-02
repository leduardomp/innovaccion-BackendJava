package practicaLineUp.pojos;

import java.util.List;

public class Albun {
    
    private int id;
    private String nombre;
    private String urlImgPortada;
    private List<Cancion> listaCanciones;

    public Albun(int id, String nombre, String urlImgPortada, List<Cancion> listaCanciones) {
        this.id = id;
        this.nombre = nombre;
        this.urlImgPortada = urlImgPortada;
        this.listaCanciones = listaCanciones;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getUrlImgPortada() {return urlImgPortada;}
    public List<Cancion> getListaCanciones() {return listaCanciones;}

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

    public boolean setUrlImgPortada(String urlImgPortada) {
        if(!urlImgPortada.isEmpty()) {
            this.urlImgPortada = urlImgPortada;
            return true;
        }else return false;
    }

    public boolean setListaCanciones(List<Cancion> listaCanciones) {
        if(listaCanciones.size()>0) {
            this.listaCanciones = listaCanciones;
            return true;
        }else return false;
    }
}
