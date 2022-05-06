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

        //Molotov
        List<Cancion> listaCancionesMolotov = new ArrayList<>();
        listaCancionesMolotov.add(new Cancion(1, "No olvidamos", (float)4.39, "mp3/molotov/no_olvidamos.mp3"));
        listaCancionesMolotov.add(new Cancion(2, "Frijolero", (float)3.36, "mp3/molotov/frijolero.mp3"));

        Albun albunNuevoSencillo = new Albun(1, "Nuevo sencillo", "mp3/molotov/no_olvidamos.jpg", listaCancionesMolotov);
        List<Albun> listaAlbunNuevoSencilloMolotov = new ArrayList<>();
        listaAlbunNuevoSencilloMolotov.add(albunNuevoSencillo);

        Artista artistaMolotov = new Artista(1, "Molotov", "mp3/molotov/logo.jpeg", listaAlbunNuevoSencilloMolotov);


        //Enanitos Verdes
        List<Cancion> enanitosVerdes = new ArrayList<>();
        enanitosVerdes.add(new Cancion(1, "Lamento Boliviano", (float)4.39, "mp3/enanitosVerdes/lamentoBoliviano.mp3"));
        enanitosVerdes.add(new Cancion(2, "Y ahora te vas", (float)3.36, "mp3/enanitosVerdes/yAhoraTeVas.mp3"));

        List<Albun> listaAlbunEnanitosVerdes = new ArrayList<>();
        listaAlbunEnanitosVerdes.add(new Albun(1, "Nuevo sencillo", "mp3/enanitosVerdes/maxresdefault.jpg", enanitosVerdes));

        //Listado de artistas del Evento
        List<Artista> listaArtistas = new ArrayList<>();
        listaArtistas.add(artistaMolotov);
        listaArtistas.add(new Artista(1, "Enanitos Verdes", "mp3/enanitosVerdes/logo.jpg", listaAlbunEnanitosVerdes));

        return listaArtistas;
    }

}
