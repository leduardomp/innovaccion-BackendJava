package practicaMona;

public class MonaLuchador extends Mona{

    private boolean mascara;
    private String colorMascara;
    private boolean puños;
    private String colorPuños;
    private String tipoTraje;
    private String colorTraje;

    public MonaLuchador(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, boolean mascara, String colorMascara, boolean puños, String colorPuños, String tipoTraje, String colorTraje) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara);
        this.mascara = mascara;
        this.colorMascara = colorMascara;
        this.puños = puños;
        this.colorPuños = colorPuños;
        this.tipoTraje = tipoTraje;
        this.colorTraje = colorTraje;
    }

    public boolean isMascara() {return mascara;}
    public String getColorMascara() {return colorMascara;}
    public boolean isPuños() {return puños;}
    public String getColorPuños() {return colorPuños;}
    public String getTipoTraje() {return tipoTraje;}
    public String getColorTraje() {return colorTraje;}

    public void setMascara(boolean mascara) {
        this.mascara = mascara;
    }

    public boolean setColorMascara(String colorMascara) {
        if(!colorMascara.isEmpty()){
            this.colorMascara = colorMascara;
            return true;
        }else
            return false;
    }

    public void setPuños(boolean puños) {
        this.puños = puños;
    }

    public boolean setColorPuños(String colorPuños) {
        if(!colorPuños.isEmpty()){
            this.colorPuños = colorPuños;
            return true;
        }else
            return false;
    }

    public boolean setTipoTraje(String tipoTraje) {
        if(!tipoTraje.isEmpty()){
            this.tipoTraje = tipoTraje;
            return true;
        }else
            return false;
    }

    public boolean setColorTraje(String colorTraje) {
        if(!colorTraje.isEmpty()){
            this.colorTraje = colorTraje;
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
                " mascara:"+isMascara()+
                " colorMascara:"+getColorMascara()+
                " puños:"+isPuños()+
                " tipoTraje:"+getTipoTraje()+
                " colorTraje:"+getColorTraje();
    }
}
