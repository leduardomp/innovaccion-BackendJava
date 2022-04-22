package practicaMona;

public class Main {

    public static void main(String[] args) {
        MonaTopGun monaPiloto = new MonaTopGun(
                111,
                "Topguntocat",
                2,
                true,
                "Negro",
                "Cafe claro",
                "Carne",
                "Azul con franjas rojas",
                "Verde",
                "Gris"
        );
        System.out.println(monaPiloto.showMessage());

        MonaHula monaHula = new MonaHula(
                137,
                "Hulatocat",
                5,
                true,
                "Negro",
                "Cafe claro",
                "Carne",
                "Verde",
                "Ramas",
                "Flor rosa",
                "Banyo"
        );
        System.out.println(monaHula.showMessage());

        MonaLuchador monaLuchador = new MonaLuchador(
                113,
                "Luchadortocat",
                5,
                false,
                "Negro",
                "Cafe claro",
                "Carne",
                true,
                "Tonos de verde",
                true,
                "Tonos de verde con rojo",
                "Completo",
                "Tonos de verde con rojo"
        );

        System.out.println(monaLuchador.showMessage());

        MonaMomia monaMomia = new MonaMomia(
                105,
                "Mummytocat",
                5,
                true,
                "Gris",
                "Punto negro",
                "Gris",
                "Cuerpo completo",
                "Crema",
                "Cruz en tentaculo"

        );

        System.out.println(monaMomia.showMessage());

        MonaSuperHeroe monaSuperHeroe = new MonaSuperHeroe(
                27,
                "Okal-Eltocat",
                5,
                true,
                "Negro",
                "Cafe claro grandes",
                "Carne",
                false,
                null,
                true,
                "Rojos",
                "Cuerpo completo",
                "Azul con rojo",
                true,
                "Roja",
                true,
                "DC"
        );

        System.out.println(monaSuperHeroe.showMessage());

        MonaDeportista monaDeportista = new MonaDeportista(
                93,
                "Goretocat",
                5,
                false,
                "Negro",
                "Cafe claro grandes",
                "Carne",
                "Futbol Americano",
                true,
                "Casco",
                "Dorado y rojo",
                "Roja con numeros blancos",
                "Dorado",
                "Botin alto con tachones",
                "Blancos",
                "Rojas"
        );

        System.out.println(monaDeportista.showMessage());
    }

}
