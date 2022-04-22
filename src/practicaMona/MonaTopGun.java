package practicaMona;

public class MonaTopGun extends Mona{

    private String colorCasco;
    private String colorUniforme;
    private String colorMascara;

    public MonaTopGun(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, String colorCasco, String colorUniforme, String colorMascara) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara);
        this.colorCasco = colorCasco;
        this.colorUniforme = colorUniforme;
        this.colorMascara = colorMascara;
    }

    public String getColorCasco() {return colorCasco;}
    public String getColorUniforme() {return colorUniforme;}
    public String getColorMascara() {return colorMascara;}

    public boolean setColorCasco(String colorCasco) {
        if(!colorCasco.isEmpty()){
            this.colorCasco = colorCasco;
            return true;
        }else
            return false;
    }

    public boolean setColorUniforme(String colorUniforme) {
        if(!colorUniforme.isEmpty()){
            this.colorUniforme = colorUniforme;
            return true;
        }else
            return false;
    }

    public boolean setColorMascara(String colorMascara) {
        if(!colorMascara.isEmpty()){
            this.colorMascara = colorMascara;
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
                " colorCasco:"+getColorCasco()+
                " colorUniforme:"+getColorUniforme()+
                " colorMascara:"+getColorMascara();
    }
}
