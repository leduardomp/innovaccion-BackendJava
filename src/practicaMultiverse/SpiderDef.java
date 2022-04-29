package practicaMultiverse;

import innovaccion.imonsh.Colors;
import innovaccion.imonsh.Screen;

import java.awt.Color;

public class SpiderDef extends CaracteristicasSpiderman implements ActionsSpiderman, PoderesSpiderman {

    private int sizeTitulo = 40;
    private int sizeSubtitulo = 20;
    private int sizeTitAccion = 30;
    private int sizeDesc = 15;

    private Color colorDesc = Colors.BoyZone;
    private Color colorAccion = Colors.LighterPurple;

    private long timeCambio = 1500;

    public SpiderDef(int id, String nombre, String universo, String colorTraje, String genero, String colorPiel, String colorOjos, String tipoCabello, String colorCabello, String raza) {
        super(id, nombre, universo, colorTraje, genero, colorPiel, colorOjos, tipoCabello, colorCabello, raza);
    }

    @Override
    public void columpiar(Screen screen, String img) {
        screen.out("\nColumpiarse \n", "Helvetica ", sizeTitAccion, colorAccion);
        screen.showImage(img);
    }

    @Override
    public void lanzarTelaraña(Screen screen, String img) {
        screen.out("\nLanzar telaraña \n", "Helvetica ", sizeTitAccion, colorAccion);
        screen.showImage(img);
    }

    @Override
    public void caminarSobrePadre(Screen screen, String img) {
        screen.out("\nCaminar sobre la pared\n", "Helvetica ", sizeTitAccion, colorAccion);
        screen.showImage(img);
    }

    @Override
    public void poderPrincipal(Screen screen, String poder, String img) {
        screen.out("\nPoder principal \n", "Helvetica ", sizeTitAccion, colorAccion);
        screen.out(poder+"\n");
        screen.showImage(img);
    }

    @Override
    public void poderSecundario(Screen screen, String poder, String img) {
        screen.out("\nPoder secundario\n", "Helvetica ", sizeTitAccion, colorAccion);
        screen.out(poder+"\n");
        screen.showImage(img);
    }

    public void descripcion(Screen screen) {
        screen.out(this.getNombre(), "Helvetica ", sizeTitulo, Colors.ReptileGreen);
        screen.out("\n\nGenero: "+this.getGenero()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Universo: "+this.getUniverso()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Raza: "+this.getRaza()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Color traje: "+this.getColorTraje()+"\n", "Helvetica ", sizeDesc, colorDesc);

        screen.out("\nCaracteristicas fisicas: \n", "Helvetica ", sizeSubtitulo, Colors.Desire);
        screen.out("Color piel: "+this.getColorPiel()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Color ojos: "+this.getColorOjos()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Tipo cabello: "+this.getTipoCabello()+"\t\t", "Helvetica ", sizeDesc, colorDesc);
        screen.out("Color cabello: "+this.getColorCabello()+"\n", "Helvetica ", sizeDesc, colorDesc);
    }
}
