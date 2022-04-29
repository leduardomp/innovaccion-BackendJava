package practicaMultiverse;

public class CaracteristicasSpiderman {

    private int id;
    private String nombre;
    private String universo;
    private String colorTraje;
    private String genero;
    private String colorPiel;
    private String colorOjos;
    private String tipoCabello;
    private String colorCabello;
    private String raza;

    public CaracteristicasSpiderman(int id, String nombre, String universo, String colorTraje, String genero, String colorPiel, String colorOjos, String tipoCabello, String colorCabello, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.universo = universo;
        this.colorTraje = colorTraje;
        this.genero = genero;
        this.colorPiel = colorPiel;
        this.colorOjos = colorOjos;
        this.tipoCabello = tipoCabello;
        this.colorCabello = colorCabello;
        this.raza = raza;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getUniverso() {return universo;}
    public String getColorTraje() {return colorTraje;}
    public String getGenero() {return genero;}
    public String getColorPiel() {return colorPiel;}
    public String getColorOjos() {return colorOjos;}
    public String getTipoCabello() {return tipoCabello;}
    public String getColorCabello() {return colorCabello;}
    public String getRaza(){return  raza;}

    public boolean setId(int id){
        if(id>0){
            this.id = id;
            return true;
        }
        else return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setUniverso(String universo) {
        if(!universo.isEmpty()) {
            this.universo = universo;
            return true;
        }else
            return false;
    }

    public boolean setColorTraje(String colorTraje) {
        if(!colorTraje.isEmpty()) {
            this.colorTraje = colorTraje;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty()) {
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setColorPiel(String colorPiel) {
        if(!colorPiel.isEmpty()) {
            this.colorPiel = colorPiel;
            return true;
        }else
            return false;
    }

    public boolean setColorOjos(String colorOjos) {
        if(!colorOjos.isEmpty()) {
            this.colorOjos = colorOjos;
            return true;
        }else
            return false;
    }

    public boolean setTipoCabello(String tipoCabello) {
        if(!tipoCabello.isEmpty()) {
            this.tipoCabello = tipoCabello;
            return true;
        }else
            return false;
    }

    public boolean setColorCabello(String colorCabello) {
        if(!colorCabello.isEmpty()) {
            this.colorCabello = colorCabello;
            return true;
        }else
            return false;
    }

    public boolean setRaza(String raza) {
        if(!raza.isEmpty()) {
            this.raza = raza;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return  "id:"+id+
                " nombre:"+nombre+
                " universo:"+universo+
                " colorTraje:"+colorTraje+
                " genero:"+genero+
                " colorPiel:"+colorPiel+
                " colorOjos:"+colorOjos+
                " tipoCabello:"+tipoCabello+
                " colorCabello:"+colorCabello+
                " raza:"+raza;
    }

}
