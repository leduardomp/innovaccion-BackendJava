package practicaLineUp.implementaciones;

import javazoom.jl.player.Player;
import practicaLineUp.interfaces.MP3Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class MP3PlayerImp implements MP3Player {

    @Override
    public void playCancionPlayer(Player jlPlayer) {
        try {
            jlPlayer.play();
        } catch (Exception e) {
            System.out.println("Problemas con el archivo");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stopCancionPlayer(Player jlPlayer) {
        if (jlPlayer != null) jlPlayer.close();
    }
}
