package practicaMultiverse;

import innovaccion.imonsh.Screen;

public class MainMultiverse {

    public static void main(String[] args) {
        new Runnable(){

            @Override
            public void run() {

                SpiderDef spiderManOriginal = new SpiderDef(1,"Peter Parker","actual", "Rojo con azul", "Masculino", "Clara", "Azules", "liso", "Cafe obscuro", "Humana");
                SpiderDef spiderManMorales = new SpiderDef(2,"Miles Morales","actual", "Negro con rojo", "Masculino", "Obscura", "Negros", "chino", "Negros", "Humana");
                SpiderDef spiderWoman = new SpiderDef(3,"Gwen Stacy","Tierra-65", "Blanco con negro vivos rosas", "Femenino", "Clara", "Azules", "liso", "Rubio", "Humana");
                SpiderDef spiderHam = new SpiderDef(4,"Peter Porker","Tierra-8311", "Rojo con azul", "Masculino", "Rosa", "Negros", "liso", "Cafe claro",  "Cerdo");
                SpiderDef spiderManNoir = new SpiderDef(5,"Peter Parker","Tierra-90214", "Negro", "Masculino", "Gris", "Negros", "liso", "Negro",  "Humano");

                Screen screen = new Screen("Multiuniverso de Spiderman");
                screen.setVisible(true);
                screen.setBounds(150,10,1100,800);

                spiderManOriginal.descripcion(screen);
                spiderManOriginal.columpiar(screen, "img/practicaMultiverse/spidermanOriginal/columpiarse.jpeg");
                spiderManOriginal.lanzarTelaraña(screen, "img/practicaMultiverse/spidermanOriginal/lanzarTelarana.jpeg");
                spiderManOriginal.caminarSobrePadre(screen, "img/practicaMultiverse/spidermanOriginal/caminarPared.jpg");
                spiderManOriginal.poderPrincipal(screen, "Sensor arácnido", "img/practicaMultiverse/spidermanOriginal/poder1.jpeg");
                spiderManOriginal.poderSecundario(screen, "", "img/practicaMultiverse/spidermanOriginal/caminarPared.jpg");

                esperar(this,2500);
                screen.cls();

                spiderManMorales.descripcion(screen);
                spiderManMorales.columpiar(screen, "img/practicaMultiverse/spiderManMorales/columpiarse.jpeg");
                spiderManMorales.lanzarTelaraña(screen, "img/practicaMultiverse/spiderManMorales/lanzarTelarana.jpg");
                spiderManMorales.caminarSobrePadre(screen, "img/practicaMultiverse/spiderManMorales/caminarPared.jpg");
                spiderManMorales.poderPrincipal(screen, "Invisibilidad", "img/practicaMultiverse/spiderManMorales/poder1.jpeg");
                spiderManMorales.poderSecundario(screen, "Electrico", "img/practicaMultiverse/spiderManMorales/poder2.jpg");

                esperar(this,2500);
                screen.cls();

                spiderWoman.descripcion(screen);
                spiderWoman.columpiar(screen, "img/practicaMultiverse/spiderWoman/columpiarse.jpeg");
                spiderWoman.lanzarTelaraña(screen, "img/practicaMultiverse/spiderWoman/lanzarTelarana.jpg");
                spiderWoman.caminarSobrePadre(screen, "img/practicaMultiverse/spiderWoman/caminarPared.gif");
                spiderWoman.poderPrincipal(screen, "Sentido aracnido", "img/practicaMultiverse/spiderWoman/poder1.jpg");
                spiderWoman.poderSecundario(screen, "Electrico", "img/practicaMultiverse/spiderWoman/poder2.gif");

                esperar(this,2500);
            }
        }.run();

    }

    private static void esperar(Runnable runnable, long time){
        try {
            synchronized (runnable){
                runnable.wait(time);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
