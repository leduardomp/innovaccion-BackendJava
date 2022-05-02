package practicaLineUp.implementaciones;


import javazoom.jl.player.Player;
import practicaLineUp.interfaces.MP3Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayCancionImp implements ActionListener {

    private Thread tareaPrincipal;
    private MP3Player mp3Player;
    private Player jlPlayer;
    private Runnable hiloCancionImp;


    public PlayCancionImp(MP3Player mp3Player, Player jlPlayer){
        this.mp3Player = mp3Player;
        this.jlPlayer = jlPlayer;
        this.createHilo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.createHilo();
        tareaPrincipal.start();
    }

    private void createHilo(){
        hiloCancionImp = new HiloCancionImp(mp3Player, jlPlayer);
        tareaPrincipal = new Thread(hiloCancionImp);
    }

    public Thread getTarea(){
        return tareaPrincipal;
    }
}
