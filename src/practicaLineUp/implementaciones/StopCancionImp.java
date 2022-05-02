package practicaLineUp.implementaciones;

import javazoom.jl.player.Player;
import practicaLineUp.interfaces.MP3Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopCancionImp implements ActionListener {

    private MP3Player mp3Player;
    private Thread tareaPrincipal;
    private Player jlPlayer;

    public StopCancionImp(Thread tareaPrincipal, MP3Player mp3Player, Player jlPlayer) {
        this.tareaPrincipal = tareaPrincipal;
        this.mp3Player = mp3Player;
        this.jlPlayer = jlPlayer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tareaPrincipal.interrupt();
        mp3Player.stopCancionPlayer(jlPlayer);
    }

}
