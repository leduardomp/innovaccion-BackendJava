package practicaLineUp.view;

import jaco.mp3.player.MP3Player;
import practicaLineUp.pojos.Albun;
import practicaLineUp.pojos.Artista;
import practicaLineUp.pojos.Cancion;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class PanelPrincipal extends JPanel {

    private JButton playButton, stopButton;
    private MP3Player mp3Player;

    public PanelPrincipal(List<Artista> listaArtista) {
        this.setLayout(new BorderLayout());

        Random random = new Random();
        Artista artista = listaArtista.get(random.nextInt(0, listaArtista.size()));
        Albun albun = artista.getListaAlbunes().get(random.nextInt(0, artista.getListaAlbunes().size()));
        Cancion cancion = albun.getListaCanciones().get(random.nextInt(0, albun.getListaCanciones().size()));

        mp3Player = new MP3Player(new File(cancion.getUrlArchivo()));
        cargarCanciones(listaArtista, cancion, mp3Player);

        this.add(this.panelSuperior(albun.getUrlImgPortada()), BorderLayout.NORTH);
        this.add(this.panelListaArtistas(listaArtista), BorderLayout.CENTER);
    }

    private JPanel panelSuperior(String urlImgPortada) {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp3Player.play();
            }
        });
        panel.add(playButton);

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(urlImgPortada));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            panel.add(picLabel);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error:"+urlImgPortada);
        }


        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp3Player.stop();
            }
        });
        panel.add(stopButton);

        return panel;
    }

    private JPanel panelListaArtistas(List<Artista> artistaList) {
        JPanel panelListaArtistas = new JPanel();
        panelListaArtistas.setLayout(new FlowLayout());

        JPanel panelDerecho = listadoArtistas(artistaList.subList(0,artistaList.size()/2));
        JPanel panelIzquierdo = listadoArtistas(artistaList.subList((artistaList.size()/2), artistaList.size()));

        panelDerecho.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelIzquierdo.setBorder(BorderFactory.createLineBorder(Color.RED));

        panelListaArtistas.add(panelDerecho);
        panelListaArtistas.add(panelIzquierdo);

        return panelListaArtistas;
    }

    private JPanel listadoArtistas(List<Artista> artistaList) {

        JPanel panelArtistas = new JPanel();

        for (int i = 0; i< artistaList.size(); i++){
            panelArtistas.add(panelArtista(artistaList.get(i)));
        }

        return panelArtistas;
    }

    private JPanel panelArtista(Artista artista) {

        JPanel panelArtista = new JPanel();
        panelArtista.setLayout(new BorderLayout());
        try {
            panelArtista.add(new JLabel(new ImageIcon(ImageIO.read(new File(artista.getLogo())))), BorderLayout.WEST); //Imagen
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error:"+artista.getLogo());
        }
        panelArtista.add(new JLabel(artista.getNombre()), BorderLayout.EAST);

        return panelArtista;
    }

    private void cargarCanciones(List<Artista> listaArtista, Cancion cancionInicial,  MP3Player mp3Player){

        for(int i=0; i < listaArtista.size();i++){
            for(int j=0; j < listaArtista.get(i).getListaAlbunes().size(); j++){
                for(int y=0; y < listaArtista.get(i).getListaAlbunes().get(j).getListaCanciones().size(); y++){

                    if(!cancionInicial.equals(listaArtista.get(i).getListaAlbunes().get(j).getListaCanciones().get(y))){
                        mp3Player.addToPlayList(new File(listaArtista.get(i).getListaAlbunes().get(j).getListaCanciones().get(y).getUrlArchivo()));
                    }
                }
            }
        }

    }
}
