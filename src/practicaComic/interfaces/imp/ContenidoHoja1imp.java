package practicaComic.interfaces.imp;

import practicaComic.interfaces.ContenidoHoja;
import practicaComic.interfaces.Seccion;
import practicaComic.pojos.Accion;

import java.util.ArrayList;
import java.util.List;

public class ContenidoHoja1imp implements ContenidoHoja {

    @Override
    public List<Seccion> crearContenido(String baseImg ) {

        List<Accion> listaAccionesSec1Hoja1 = new ArrayList<>();
        listaAccionesSec1Hoja1.add(new Accion("Durante la Batalla con Thanos",baseImg+"hoja1/ac1.gif"));
        listaAccionesSec1Hoja1.add(new Accion("Thor utilizó su martillo con gran precision",baseImg+"hoja1/ac2.gif"));
        listaAccionesSec1Hoja1.add(new Accion("Acabando con muchos enemigos",baseImg+"hoja1/ac3.gif"));
        SeccionImp seccionImpH1sec1 = new SeccionImp();
        seccionImpH1sec1.setAcciones(listaAccionesSec1Hoja1);

        List<Accion> listaAccionesSec2Hoja1 = new ArrayList<>();
        listaAccionesSec2Hoja1.add(new Accion("A esta lucho tmb se unieron las superheroes",baseImg+"hoja1/ac4.gif"));
        listaAccionesSec2Hoja1.add(new Accion("Pelearon todos juntos",baseImg+"hoja1/ac5.gif"));
        listaAccionesSec2Hoja1.add(new Accion("Pero era imposible vencer a Thanos",baseImg+"hoja1/ac6.gif"));
        SeccionImp seccionImpH1sec2 = new SeccionImp();
        seccionImpH1sec2.setAcciones(listaAccionesSec2Hoja1);

        List<Accion> listaAccionesSec3Hoja1 = new ArrayList<>();
        listaAccionesSec3Hoja1.add(new Accion("Ironman entiende lo que le dijo Dr Strange",baseImg+"hoja1/ac7.gif"));
        listaAccionesSec3Hoja1.add(new Accion("Pero Ironman se tuvo que sacrificar",baseImg+"hoja1/ac8.gif"));
        listaAccionesSec3Hoja1.add(new Accion("Para terminar con Thanos",baseImg+"hoja1/ac9.gif"));
        SeccionImp seccionImpH1sec3 = new SeccionImp();
        seccionImpH1sec3.setAcciones(listaAccionesSec3Hoja1);


        List<Seccion> seccionImpListH1 = new ArrayList<>();
        seccionImpListH1.add(seccionImpH1sec1);
        seccionImpListH1.add(seccionImpH1sec2);
        seccionImpListH1.add(seccionImpH1sec3);

        return seccionImpListH1;

    }
}
