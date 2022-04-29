package practicaComic.interfaces.imp;

import innovaccion.imonsh.Screen;
import practicaComic.interfaces.Hoja;
import practicaComic.interfaces.Seccion;

import java.awt.*;
import java.util.List;

public class HojaImp implements Hoja {

    @Override
    public void secciones(Screen screen, List<Seccion> listaSecciones) {

        for (int i = 0; i < listaSecciones.size(); i++) {
            screen.out("\n\n");
            Seccion seccion = listaSecciones.get(i);
            seccion.showAcciones(screen);
        }

    }

    @Override
    public void pieDePagina(Screen screen, int numeroPagina) {
        screen.out("\n\n\t\t\t\t\t\t pagina "+numeroPagina, Color.BLACK);
    }
}
