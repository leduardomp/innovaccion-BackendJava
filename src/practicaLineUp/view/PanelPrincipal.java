package practicaLineUp.view;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import practicaLineUp.implementaciones.HiloCancionImp;
import practicaLineUp.implementaciones.MP3PlayerImp;
import practicaLineUp.implementaciones.PlayCancionImp;
import practicaLineUp.implementaciones.StopCancionImp;
import practicaLineUp.interfaces.MP3Player;
import practicaLineUp.pojos.Albun;
import practicaLineUp.pojos.Artista;
import practicaLineUp.pojos.Cancion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class PanelPrincipal extends JPanel {

    private JButton playButton;
    private JButton stopButton;
    private MP3Player mp3Player;
    private Player jlPlayer;

    public PanelPrincipal(Artista artista) throws IOException {
        this.setLayout(new BorderLayout(10,10));
        this.add(this.panelSuperior(artista));
    }

    private JPanel panelSuperior(Artista artista) throws IOException {

        Random random = new Random();
        int indexAlbun = random.nextInt(0, artista.getListaAlbunes().size());
        Albun albun = artista.getListaAlbunes().get(indexAlbun);

        int indexCancion = random.nextInt(0, albun.getListaCanciones().size());
        Cancion cancion = albun.getListaCanciones().get(indexCancion);

        try {
            mp3Player = new MP3PlayerImp();
            jlPlayer = new Player(new BufferedInputStream(new FileInputStream(cancion.getUrlArchivo())));

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (JavaLayerException e) {
            throw new RuntimeException(e);
        }

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        playButton = new JButton("Play");
        PlayCancionImp playCancion = new PlayCancionImp(mp3Player, jlPlayer);
        playButton.addActionListener(playCancion);
        panel.add(playButton);

        BufferedImage myPicture = ImageIO.read(new File(albun.getUrlImgPortada()));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setSize(50,30);
        panel.add(picLabel);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new StopCancionImp(playCancion.getTarea(), mp3Player, jlPlayer));
        panel.add(stopButton);

        return panel;
    }

}
