package practicaLineUp.implementaciones;

import practicaLineUp.interfaces.Evento;
import practicaLineUp.pojos.Albun;
import practicaLineUp.pojos.Artista;
import practicaLineUp.pojos.Cancion;

import java.util.ArrayList;
import java.util.List;

public class EventoImp implements Evento {


    @Override
    public List<Artista> getListaArtistas() {

        List<Artista> listaArtistas = new ArrayList<>();

        Cancion cancion1Molotov = new Cancion(1, "No olvidamos", (float)4.39, "mp3/molotov/no_olvidamos.mp3");
        List<Cancion> listaCancionesMolotov = new ArrayList<>();
        listaCancionesMolotov.add(cancion1Molotov);
        Albun albunNuevoSencillo = new Albun(1, "Nuevo sencillo", "mp3/molotov/no_olvidamos.jpg", listaCancionesMolotov);
        List<Albun> listaAlbunNuevoSencilloMolotov = new ArrayList<>();
        listaAlbunNuevoSencilloMolotov.add(albunNuevoSencillo);
        Artista artistaMolotov = new Artista(1, "Molotov", "", listaAlbunNuevoSencilloMolotov);

        listaArtistas.add(artistaMolotov);

        return listaArtistas;
    }
}
