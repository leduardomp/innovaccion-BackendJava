package practicaComic.interfaces.imp;

import practicaComic.interfaces.ContenidoHoja;
import practicaComic.interfaces.Seccion;
import practicaComic.pojos.Accion;

import java.util.ArrayList;
import java.util.List;

public class ContenidoHoja2imp implements ContenidoHoja {

    @Override
    public List<Seccion> crearContenido(String baseImg) {

        List<Accion> listaAccionesSec1hoja2 = new ArrayList<>();
        listaAccionesSec1hoja2.add(new Accion("Al funeral de Iroman, acudieron todos",baseImg+"hoja2/ac1.gif"));
        listaAccionesSec1hoja2.add(new Accion("Pero no era el final Spiderman obtuvo un regalo",baseImg+"hoja2/ac2.gif"));
        listaAccionesSec1hoja2.add(new Accion("El legado de Tony Stark y su industria",baseImg+"hoja2/ac3.gif"));
        SeccionImp seccionImpH2sec1 = new SeccionImp();
        seccionImpH2sec1.setAcciones(listaAccionesSec1hoja2);

        List<Accion> listaAccionesSec2hoja2 = new ArrayList<>();
        listaAccionesSec2hoja2.add(new Accion("Spiderman por joven hace un cao",baseImg+"hoja2/ac4.gif"));
        listaAccionesSec2hoja2.add(new Accion("Creando multiuniversos",baseImg+"hoja2/ac5.gif"));
        listaAccionesSec2hoja2.add(new Accion("Varios personajes alternos",baseImg+"hoja2/ac6.gif"));
        SeccionImp seccionImpH2sec2 = new SeccionImp();
        seccionImpH2sec2.setAcciones(listaAccionesSec2hoja2);

        List<Accion> listaAccionesSec3hoja2 = new ArrayList<>();
        listaAccionesSec3hoja2.add(new Accion("Cada uno con caracteristicas diferentes",baseImg+"hoja2/ac7.gif"));
        listaAccionesSec3hoja2.add(new Accion("Uno se puede volver invisible",baseImg+"hoja2/ac8.gif"));
        listaAccionesSec3hoja2.add(new Accion("Otro es un puerco humano",baseImg+"hoja2/ac9.gif"));
        SeccionImp seccionImpH2sec3 = new SeccionImp();
        seccionImpH2sec3.setAcciones(listaAccionesSec3hoja2);


        List<Seccion> seccionImpListH2 = new ArrayList<>();
        seccionImpListH2.add(seccionImpH2sec1);
        seccionImpListH2.add(seccionImpH2sec2);
        seccionImpListH2.add(seccionImpH2sec3);

        return seccionImpListH2;
    }
}
