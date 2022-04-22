package practicaMona;

public class Mona {

    private int id;
    private String nombre;
    private int numTentaculos;
    private boolean bigotes;
    private String colorCuerpo;
    private String colorOjos;
    private String colorCara;

    public Mona(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara) {
        this.id = id;
        this.nombre = nombre;
        this.numTentaculos = numTentaculos;
        this.bigotes = bigotes;
        this.colorCuerpo = colorCuerpo;
        this.colorOjos = colorOjos;
        this.colorCara = colorCara;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public int getNumTentaculos() {return numTentaculos;}
    public boolean isBigotes() {return bigotes;}
    public String getColorCuerpo() {return colorCuerpo;}
    public String getColorOjos() {return colorOjos;}
    public String getColorCara() {return colorCara;}

    public boolean setId(int id) {
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setNumTentaculos(int numTentaculos) {
        if(numTentaculos > 0){
            this.numTentaculos = numTentaculos;
            return true;
        }else
            return false;
    }

    public void setBigotes(boolean bigotes) {
        this.bigotes = bigotes;
    }

    public boolean setColorCuerpo(String colorCuerpo) {
        if(!colorCuerpo.isEmpty()){
            this.colorCuerpo = colorCuerpo;
            return true;
        }else
            return false;
    }

    public boolean setColorOjos(String colorOjos) {
        if(!colorOjos.isEmpty()){
            this.colorOjos = colorOjos;
            return true;
        }else
            return false;
    }

    public boolean setColorCara(String colorCara) {
        if(!colorCara.isEmpty()){
            this.colorCara = colorCara;
            return true;
        }else
            return false;
    }
}
