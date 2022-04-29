package practicaComic.pojos;

public class Accion {

    public String texto;
    public String imagen;

    public Accion(String texto, String imagen) {
        this.texto = texto;
        this.imagen = imagen;
    }

    public String getTexto() {return texto;}
    public String getImagen() {return imagen;}

    public boolean setTexto(String texto) {
        if(!texto.isEmpty()){
            this.texto = texto;
            return true;
        }
        else return false;
    }

    public boolean setImagen(String imagen) {
        if(!imagen.isEmpty()){
            this.imagen = imagen;
            return true;
        }
        else return false;

    }
}
