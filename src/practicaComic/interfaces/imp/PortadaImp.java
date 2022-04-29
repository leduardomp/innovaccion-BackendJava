package practicaComic.interfaces.imp;

import innovaccion.imonsh.Screen;
import practicaComic.interfaces.Portada;

import java.awt.*;

public class PortadaImp implements Portada {

    @Override
    public void titulo(Screen screen, String titulo) {
        screen.out(titulo+"\n\n", "Helvetica", 50, Color.cyan);
    }

    @Override
    public void img(Screen screen, String img) {
        screen.showImage(img);
    }
}
