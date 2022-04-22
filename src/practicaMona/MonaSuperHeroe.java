package practicaMona;

public class MonaSuperHeroe extends MonaLuchador{

    private boolean capa;
    private String colorCapa;
    private boolean vuela;
    private String editorial;

    public MonaSuperHeroe(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, boolean mascara, String colorMascara, boolean puños, String colorPuños, String tipoTraje, String colorTraje, boolean capa, String colorCapa, boolean vuela, String editorial) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara, mascara, colorMascara, puños, colorPuños, tipoTraje, colorTraje);
        this.capa = capa;
        this.colorCapa = colorCapa;
        this.vuela = vuela;
        this.editorial = editorial;
    }

    public boolean isCapa() {return capa;}
    public String getColorCapa() {return colorCapa;}
    public boolean isVuela() {return vuela;}
    public String getEditorial() {return editorial;}

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public boolean setColorCapa(String colorCapa) {
        if(!colorCapa.isEmpty()){
            this.colorCapa = colorCapa;
            return true;
        }else
            return false;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean setEditorial(String editorial) {
        if(!colorCapa.isEmpty()){
            this.colorCapa = colorCapa;
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
                " colorTraje:"+getColorTraje()+
                " capa:"+isCapa()+
                " colorCapa:"+getColorCapa()+
                " vuela:"+isVuela()+
                " editorial:"+getEditorial();
    }
}
