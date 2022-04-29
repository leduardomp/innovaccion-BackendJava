package practicaComic.interfaces;

import innovaccion.imonsh.Screen;

import java.util.List;

public interface Hoja {
    public void secciones(Screen screen, List<Seccion> listaSecciones);
    public void pieDePagina(Screen screen, int numeroPagina);
}
