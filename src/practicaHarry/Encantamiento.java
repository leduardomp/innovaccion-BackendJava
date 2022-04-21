package practicaHarry;

public class Encantamiento {

    private int id;
    private String conjuro;
    private String colorLuz;
    private String efecto;
    private String movimientoMano;

    public Encantamiento(int id, String conjuro, String colorLuz, String efecto, String movimientoMano) {
        this.id = id;
        this.conjuro = conjuro;
        this.colorLuz = colorLuz;
        this.efecto = efecto;
        this.movimientoMano = movimientoMano;
    }

    public int getId() {return id;}
    public String getConjuro() {return conjuro;}
    public String getColorLuz() {return colorLuz;}
    public String getEfecto() {return efecto;}
    public String getMovimientoMano() {return movimientoMano;}

    public boolean setId(int id) {
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setConjuro(String conjuro) {
        if(!conjuro.isEmpty()){
            this.conjuro = conjuro;
            return true;
        }else
            return false;
    }

    public boolean setColorLuz(String colorLuz) {
        if(!colorLuz.isEmpty()){
            this.colorLuz = colorLuz;
            return true;
        }else
            return false;
    }

    public boolean setEfecto(String efecto) {
        if(!efecto.isEmpty()){
            this.efecto = efecto;
            return true;
        }else
            return false;
    }

    public boolean setMovimientoMano(String movimientoMano) {
        if(!movimientoMano.isEmpty()){
            this.movimientoMano = movimientoMano;
            return true;
        }else
            return false;
    }

    public void showMessage(){

        System.out.println(
                " id:"+id+
                        " conjuro:"+conjuro+
                        " colorLuz:"+colorLuz+
                        " efecto:"+efecto+
                        " movimientoMano:"+movimientoMano
        );
    }

}
