package practicaComic.interfaces.imp;

import innovaccion.imonsh.Screen;
import practicaComic.interfaces.Seccion;
import practicaComic.pojos.Accion;

import java.awt.*;
import java.util.List;

public class SeccionImp implements Seccion {

    private List<Accion> listaAcciones;

    @Override
    public void showAcciones(Screen screen) {

        for (int i = 0; i < listaAcciones.size(); i++) {
            Accion accion = listaAcciones.get(i);
            screen.out(accion.getTexto()+"\t\t");
        }

        screen.out("\n");

        for (int i = 0; i < listaAcciones.size(); i++) {
            Accion accion = listaAcciones.get(i);

            screen.showImage(accion.getImagen());
        }

    }

    public void setAcciones(List<Accion> listaAcciones){
        this.listaAcciones = listaAcciones;
    }
}
