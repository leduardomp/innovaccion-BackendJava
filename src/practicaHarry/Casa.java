package practicaHarry;

public class Casa {

    private int id;
    private String nombre;
    private int idPersonajeFundador;
    private String[] colores;
    private String animal;
    private String[] rasgos;
    private int idPersonajeJefe;
    private int idPersonajeFantasma;
    private String salaComun;

    public Casa(int id, String nombre, int idPersonajeFundador, String[] colores, String animal, String[] rasgos, int idPersonajeJefe, int idPersonajeFantasma, String salaComun) {
        this.id = id;
        this.nombre = nombre;
        this.idPersonajeFundador = idPersonajeFundador;
        this.colores = colores;
        this.animal = animal;
        this.rasgos = rasgos;
        this.idPersonajeJefe = idPersonajeJefe;
        this.idPersonajeFantasma = idPersonajeFantasma;
        this.salaComun = salaComun;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public int getIdPersonajeFundador() {return idPersonajeFundador;}
    public String[] getColores() {return colores;}
    public String getAnimal() {return animal;}
    public String[] getRasgos() {return rasgos;}
    public int getIdPersonajeJefe() {return idPersonajeJefe;}
    public int getIdPersonajeFantasma() {return idPersonajeFantasma;}
    public String getSalaComun() {return salaComun;}

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

    public boolean setIdPersonajeFundador(int idPersonajeFundador) {
        if(idPersonajeFundador > 0){
            this.idPersonajeFundador = idPersonajeFundador;
            return true;
        }else
            return false;
    }

    public boolean setColores(String[] colores) {
        if(colores.length > 0){
            this.colores = colores;
            return true;
        }else
            return false;
    }

    public boolean setAnimal(String animal) {
        if(!animal.isEmpty()){
            this.animal = animal;
            return true;
        }else
            return false;
    }

    public boolean setRasgos(String[] rasgos) {
        if(rasgos.length > 0){
            this.rasgos = rasgos;
            return true;
        }else
            return false;
    }

    public boolean setIdPersonajeJefe(int idPersonajeJefe) {
        if(idPersonajeJefe > 0){
            this.idPersonajeJefe = idPersonajeJefe;
            return true;
        }else
            return false;
    }

    public boolean setIdPersonajeFantasma(int idPersonajeFantasma) {
        if(idPersonajeFantasma > 0){
            this.idPersonajeFantasma = idPersonajeFantasma;
            return true;
        }else
            return false;
    }

    public boolean setSalaComun(String salaComun) {
        if(!salaComun.isEmpty()){
            this.salaComun = salaComun;
            return true;
        }else
            return false;
    }

    public void showMessage(){

        String listColores = "[";
        for (int i = 0; i < colores.length; i++) {
            listColores += colores[i]+",";
        }
        listColores += "]";

        String listRasgos = "[";
        for (int i = 0; i < rasgos.length; i++) {
            listRasgos += rasgos[i]+",";
        }
        listRasgos += "]";

        System.out.println(
                " id:"+id+
                        " nombre:"+nombre+
                        " idPersonajeFundador:"+idPersonajeFundador+
                        " colores:"+listColores+
                        " animal:"+animal+
                        " rasgos:"+listRasgos+
                        " idPersonajeJefe:"+idPersonajeJefe+
                        " idPersonajeFantasma:"+idPersonajeFantasma+
                        " salaComun:"+salaComun
        );
    }
}
