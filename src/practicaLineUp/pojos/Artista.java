package practicaLineUp.pojos;

import java.util.List;

public class Artista {

    private int id;
    private String nombre;
    private String logo;
    private List<Albun> listaAlbunes;

    public Artista(int id, String nombre, String logo, List<Albun> listaAlbunes) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.listaAlbunes = listaAlbunes;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getLogo() {return logo;}
    public List<Albun> getListaAlbunes() {return listaAlbunes;}

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
        }return false;
    }

    public boolean setLogo(String logo) {
        if(!logo.isEmpty()) {
            this.logo = logo;
            return true;
        }else return false;
    }

    public boolean setListaAlbunes(List<Albun> listaAlbunes) {
        if(listaAlbunes.size()>0) {
            this.listaAlbunes = listaAlbunes;
            return true;
        }else return false;
    }
}
