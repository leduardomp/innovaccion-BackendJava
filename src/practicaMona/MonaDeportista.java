package practicaMona;

public class MonaDeportista extends Mona{

    private String deporte;
    private boolean proteccionCabeza;
    private String tipoProteccionCabeza;
    private String colorProteccionCabeza;
    private String colorPlayeraUniforme;
    private String colorPantalonUniforme;
    private String tipoTenis;
    private String colorTenis;
    private String colorCalcetas;

    public MonaDeportista(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, String deporte, boolean proteccionCabeza, String tipoProteccionCabeza, String colorProteccionCabeza, String colorPlayeraUniforme, String colorPantalonUniforme, String tipoTenis, String colorTenis, String colorCalcetas) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara);
        this.deporte = deporte;
        this.proteccionCabeza = proteccionCabeza;
        this.tipoProteccionCabeza = tipoProteccionCabeza;
        this.colorProteccionCabeza = colorProteccionCabeza;
        this.colorPlayeraUniforme = colorPlayeraUniforme;
        this.colorPantalonUniforme = colorPantalonUniforme;
        this.tipoTenis = tipoTenis;
        this.colorTenis = colorTenis;
        this.colorCalcetas = colorCalcetas;
    }

    public String getDeporte() {return deporte;}
    public boolean isProteccionCabeza() {return proteccionCabeza;}
    public String getTipoProteccionCabeza() {return tipoProteccionCabeza;}
    public String getColorProteccionCabeza() {return colorProteccionCabeza;}
    public String getColorPlayeraUniforme() {return colorPlayeraUniforme;}
    public String getColorPantalonUniforme() {return colorPantalonUniforme;}
    public String getTipoTenis() {return tipoTenis;}
    public String getColorTenis() {return colorTenis;}
    public String getColorCalcetas() {return colorCalcetas;}

    public boolean setDeporte(String deporte) {
        if(!deporte.isEmpty()){
            this.deporte = deporte;
            return true;
        }else
            return false;
    }

    public void setProteccionCabeza(boolean proteccionCabeza) {
        this.proteccionCabeza = proteccionCabeza;
    }

    public boolean setTipoProteccionCabeza(String tipoProteccionCabeza) {
        if(!tipoProteccionCabeza.isEmpty()){
            this.tipoProteccionCabeza = tipoProteccionCabeza;
            return true;
        }else
            return false;
    }

    public boolean setColorProteccionCabeza(String colorProteccionCabeza) {
        if(!colorProteccionCabeza.isEmpty()){
            this.colorProteccionCabeza = colorProteccionCabeza;
            return true;
        }else
            return false;
    }

    public boolean setColorPlayeraUniforme(String colorPlayeraUniforme) {
        if(!colorPlayeraUniforme.isEmpty()){
            this.colorPlayeraUniforme = colorPlayeraUniforme;
            return true;
        }else
            return false;
    }

    public boolean setColorPantalonUniforme(String colorPantalonUniforme) {
        if(!colorPantalonUniforme.isEmpty()){
            this.colorPantalonUniforme = colorPantalonUniforme;
            return true;
        }else
            return false;
    }

    public boolean setTipoTenis(String tipoTenis) {
        if(!tipoTenis.isEmpty()){
            this.tipoTenis = tipoTenis;
            return true;
        }else
            return false;
    }

    public boolean setColorTenis(String colorTenis) {
        if(!colorTenis.isEmpty()){
            this.colorTenis = colorTenis;
            return true;
        }else
            return false;
    }

    public boolean setColorCalcetas(String colorCalcetas) {
        if(!colorCalcetas.isEmpty()){
            this.colorCalcetas = colorCalcetas;
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
                " deporte:"+getDeporte()+
                " proteccionCabeza:"+isProteccionCabeza()+
                " tipoProteccionCabeza:"+getTipoProteccionCabeza()+
                " colorProteccionCabeza:"+getColorProteccionCabeza()+
                " colorPlayeraUniforme:"+getColorPlayeraUniforme()+
                " colorPantalonUniforme:"+getColorPantalonUniforme()+
                " tipoTenis:"+getTipoTenis()+
                " colorTenis:"+getColorTenis()+
                " colorCalcetas:"+getColorTenis();
    }

}
