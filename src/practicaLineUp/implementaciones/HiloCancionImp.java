package practicaLineUp.implementaciones;

import javazoom.jl.player.Player;
import practicaLineUp.interfaces.MP3Player;

import java.util.Scanner;

public class HiloCancionImp implements Runnable{

    private MP3Player mp3Player;
    private Player jlPlayer;

    public HiloCancionImp(MP3Player mp3Player, Player jlPlayer) {
        this.mp3Player = mp3Player;
        this.jlPlayer = jlPlayer;
    }

    @Override
    public void run() {
        mp3Player.playCancionPlayer(jlPlayer);
        Scanner sc = new Scanner(System.in);
        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.stopCancionPlayer(jlPlayer);
        }
    }
}
