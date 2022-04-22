package practicaMona;

public class MonaMomia extends Mona{

    private String vendaCuerpo;
    private String colorVenda;
    private String accesorios;

    public MonaMomia(int id, String nombre, int numTentaculos, boolean bigotes, String colorCuerpo, String colorOjos, String colorCara, String vendaCuerpo, String colorVenda, String accesorios) {
        super(id, nombre, numTentaculos, bigotes, colorCuerpo, colorOjos, colorCara);
        this.vendaCuerpo = vendaCuerpo;
        this.colorVenda = colorVenda;
        this.accesorios = accesorios;
    }

    public String getVendaCuerpo() {return vendaCuerpo;}
    public String getColorVenda() {return colorVenda;}
    public String getAccesorios() {return accesorios;}

    public boolean setVendaCuerpo(String vendaCuerpo) {
        if(!vendaCuerpo.isEmpty()){
            this.vendaCuerpo = vendaCuerpo;
            return true;
        }else
            return false;
    }

    public boolean setColorVenda(String colorVenda) {
        if(!vendaCuerpo.isEmpty()){
            this.vendaCuerpo = vendaCuerpo;
            return true;
        }else
            return false;
    }

    public boolean setAccesorios(String accesorios) {
        if(!vendaCuerpo.isEmpty()){
            this.vendaCuerpo = vendaCuerpo;
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
                " vendaCuerpo:"+getVendaCuerpo()+
                " colorVenda:"+getColorVenda()+
                " accesorios:"+getAccesorios();
    }
}
