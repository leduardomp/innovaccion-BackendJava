package practicaMona;

public class MonaHula extends Mona{

    private String colorFalda;
    private String materialFalda;
    private String adornoCabello;
    private String instrumento;

    public MonaHula(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, String colorFalda, String materialFalda, String adornoCabello, String instrumento) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara);
        this.colorFalda = colorFalda;
        this.materialFalda = materialFalda;
        this.adornoCabello = adornoCabello;
        this.instrumento = instrumento;
    }

    public String getColorFalda() {return colorFalda;}
    public String getMaterialFalda() {return materialFalda;}
    public String getAdornoCabello() {return adornoCabello;}
    public String getInstrumento() {return instrumento;}

    public boolean setColorFalda(String colorFalda) {
        if(!colorFalda.isEmpty()){
            this.colorFalda = colorFalda;
            return true;
        }else
            return false;
    }

    public boolean setMaterialFalda(String materialFalda) {
        if(!materialFalda.isEmpty()){
            this.materialFalda = materialFalda;
            return true;
        }else
            return false;
    }

    public boolean setAdornoCabello(String adornoCabello) {
        if(!adornoCabello.isEmpty()){
            this.adornoCabello = adornoCabello;
            return true;
        }else
            return false;
    }

    public boolean setInstrumento(String instrumento) {
        if(!instrumento.isEmpty()){
            this.instrumento = instrumento;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return " id:"+getId()+
                " nombre:"+getNombre()+
                " numTentaculos:"+getNumTentaculos()+
                " bigotes:"+isBigotes()+
                " colorCuerpo:"+getColorCuerpo()+
                " colorOjos:"+getColorOjos()+
                " colorCara:"+getColorCara()+
                " colorFalda:"+getColorFalda()+
                " materialFalda:"+getMaterialFalda()+
                " adornoCabello:"+getAdornoCabello()+
                " instrumento:"+getInstrumento();
    }
}
