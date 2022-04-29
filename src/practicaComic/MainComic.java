package practicaComic;

import innovaccion.imonsh.Screen;
import practicaComic.interfaces.Hoja;
import practicaComic.interfaces.Seccion;
import practicaComic.interfaces.imp.*;
import practicaComic.pojos.Accion;

import java.util.ArrayList;
import java.util.List;

public class MainComic {

    private static String baseImg = "img/practicaComic/";

    public static void main(String[] args) {
        new Runnable(){

            @Override
            public void run() {
                Screen screen = new Screen("Comic - ");
                screen.setBounds(150,0,1100,900);
                screen.setVisible(true);

                PortadaImp portadaImp = new PortadaImp();
                portadaImp.titulo(screen, "Avengers - el Renacer");
                portadaImp.img(screen, baseImg+"portada/portada.gif");

                esperar(this,1000*3);
                screen.cls();
                screen.repaint();

                HojaImp hojaImp = new HojaImp();
                hojaImp.secciones(screen, new ContenidoHoja1imp().crearContenido(baseImg));
                hojaImp.pieDePagina(screen, 1);

                esperar(this,1000*20);
                screen.cls();
                screen.repaint();

                hojaImp.secciones(screen, new ContenidoHoja2imp().crearContenido(baseImg));
                hojaImp.pieDePagina(screen, 2);

            }
        }.run();
    }

    private static void esperar(Runnable runnable, long timeMilisegundos) {

        try{
            synchronized (runnable){
                runnable.wait(timeMilisegundos);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
