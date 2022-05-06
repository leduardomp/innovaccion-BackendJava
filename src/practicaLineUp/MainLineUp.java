package practicaLineUp;

import innovaccion.imonsh.Screen;
import practicaLineUp.implementaciones.EventoImp;
import practicaLineUp.view.PanelPrincipal;

import java.awt.*;
import java.io.IOException;

public class MainLineUp {

    public static void main(String[] args){

        EventoImp eventoImp = new EventoImp();
        Screen screen = new Screen();
        screen.setBounds(new Rectangle(900,600));
        screen.setLocationRelativeTo(null);
        screen.add(new PanelPrincipal(eventoImp.getListaArtistas()));
        screen.setVisible(true);

    }

}
