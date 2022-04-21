package practicaHarry;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Varita varitaEndrino = new Varita(
                1,
                "Varita de endrino",
                new String[]{"Madera de endrino"},
                10,
                "Desconocido"
        );

        Varita varitaHarryPotter = new Varita(
                2,
                "Varita de Harry Potter",
                new String[]{"Madera de acebo","Nucleo de pluma de fénix"},
                28,
                "Garrick Ollivander"
        );

        Varita varitaHermione = new Varita(
                2,
                "Varita de Hermione",
                new String[]{"Madera de vid","Nucleo de fibra de corazón de dragón"},
                (float) 27.3,
                "Garrick Ollivander"
        );

        varitaEndrino.showMessage();
        varitaHermione.showMessage();
        varitaHarryPotter.showMessage();

        Encantamiento encantamientoAscendio = new Encantamiento(
                1,
                "Ascendio",
                "ninguna",
                "Eleva al usuario por los aires",
                "img/practicaHarry/ascendio.webp");

        Encantamiento encantamientoCantis = new Encantamiento(
                2,
                "Cantis",
                "Rosa",
                "Hace que el objetivo cante",
                "img/practicaHarry/canti.webp");

        Encantamiento encantamientoImmobulus = new Encantamiento(
                3,
                "Immobulus",
                "Azul",
                "Detiene el movimiento y las acciones del objetivo",
                "img/practicaHarry/immobilus.webp");

        encantamientoAscendio.showMessage();
        encantamientoCantis.showMessage();
        encantamientoImmobulus.showMessage();

        Casa casaHufflepuff = new Casa(
                1,
                "Hufflepuff",
                1,
                new String[]{"Amarillo","Negro"},
                "Tejon",
                new String[]{"Trabajadores","Pacientes","Equitativos","Justo","Leales","Modestos"},
                32,
                40,
                "Sótano de Hufflepuff"
        );

        Casa casaSlytherin = new Casa(
                2,
                "Slytherin",
                4,
                new String[]{"Verde","Plata"},
                "Serpiente",
                new String[]{"Ambición","Astucia","Determinación","Ingenio","Auto-preservación"},
                33,
                42,
                "Mazmorras de Slytherin"
        );

        Casa casaGryffindor = new Casa(
                3,
                "Gryffindor",
                5,
                new String[]{"Escarlata","Dorado"},
                "León",
                new String[]{"Valor","Caballerosidad"},
                34,
                45,
                "Torre de Gryffindor"
        );

        casaGryffindor.showMessage();
        casaHufflepuff.showMessage();
        casaSlytherin.showMessage();

        Personaje harryPotter = new Personaje(1);
        harryPotter.setNombre("Harry");
        harryPotter.setApellido("Potter");
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1980,06,31);
        harryPotter.setFechaNacimiento(fechaNacimiento.getTime());
        harryPotter.setTipoSangre("Sangre mestiza");
        harryPotter.setColorOjos("Verde");
        harryPotter.setColorCabello("Negro azabache");
        harryPotter.setColorPiel("Clara");
        harryPotter.setEstatura((float) 1.78);
        harryPotter.setGenero("Masculino");
        harryPotter.setEstadoCivil("Soltero");
        harryPotter.setEspecie("Humano");
        harryPotter.setLentes(true);
        harryPotter.setIdCasa(3);
        harryPotter.setTitulo("Jefe del Departamento de Seguridad Mágica");
        harryPotter.setIdPersonajePapa(30);
        harryPotter.setIdPersonajeMama(31);
        harryPotter.setIdVaritas(new int[]{1, 2});
        harryPotter.setBoggart("Dementor");
        harryPotter.setListaEncantamiento(new Encantamiento[]{encantamientoAscendio,
                encantamientoImmobulus,
                new Encantamiento(
                        4,
                        "Alohomora duo",
                        "ninguno",
                        "Supuestamente abrir cerraduras que se resistan al encantamiento de apertura básico.",
                        "ninguno"

                )});

        harryPotter.showMessage();

        Personaje hermaioneGranger = new Personaje(2);
        hermaioneGranger.setNombre("Hermione");
        hermaioneGranger.setApellido("Granger");
        Calendar fechaNacimientoH = Calendar.getInstance();
        fechaNacimiento.set(1979,8,19);
        hermaioneGranger.setFechaNacimiento(fechaNacimiento.getTime());
        hermaioneGranger.setTipoSangre("Hija de muggles");
        hermaioneGranger.setColorOjos("Marrones");
        hermaioneGranger.setColorCabello("Castaño");
        hermaioneGranger.setColorPiel("Clara");
        hermaioneGranger.setEstatura((float) 1.65);
        hermaioneGranger.setGenero("Femenino");
        hermaioneGranger.setEstadoCivil("Soltera");
        hermaioneGranger.setEspecie("Humano");
        hermaioneGranger.setLentes(false);
        hermaioneGranger.setIdCasa(3);
        hermaioneGranger.setTitulo("Ministra de Mágica");
        hermaioneGranger.setIdPersonajePapa(40);
        hermaioneGranger.setIdPersonajeMama(41);
        hermaioneGranger.setIdVaritas(new int[]{varitaHermione.getId()});
        hermaioneGranger.setBoggart("La profesora McGonagall diciéndole que reprobó todo");
        hermaioneGranger.setListaEncantamiento(new Encantamiento[]{
                encantamientoAscendio,
                encantamientoImmobulus,
                encantamientoCantis,
                new Encantamiento(
                        4,
                        "Alohomora duo",
                        "ninguno",
                        "Supuestamente abrir cerraduras que se resistan al encantamiento de apertura básico.",
                        "ninguno"

                )});

        hermaioneGranger.showMessage();
    }
}
