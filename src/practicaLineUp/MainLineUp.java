package practicaLineUp;

import innovaccion.imonsh.Screen;
import practicaLineUp.implementaciones.EventoImp;
import practicaLineUp.pojos.Albun;
import practicaLineUp.pojos.Artista;
import practicaLineUp.pojos.Cancion;
import practicaLineUp.view.PanelPrincipal;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainLineUp {

    public static void main(String[] args) throws IOException {

        EventoImp eventoImp = new EventoImp();
        List<Artista> artistaList = eventoImp.getListaArtistas();

        Random random = new Random();
        int indexArtista = random.nextInt(0, artistaList.size());

        Screen screen = new Screen();
        screen.setBounds(new Rectangle(900,600));
        screen.setLocationRelativeTo(null);
        screen.add(new PanelPrincipal(artistaList.get(indexArtista)));
        screen.setVisible(true);

    }

}
