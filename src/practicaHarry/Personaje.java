package practicaHarry;

import java.util.Date;

public class Personaje {

    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaFallecimiento;

    private String tipoSangre;
    private String colorOjos;
    private String colorCabello;
    private String colorPiel;
    private float estatura;
    private String genero;
    private String estadoCivil;
    private String especie;
    private boolean lentes;

    private int idCasa;
    private String titulo;
    private String[] lealtades;

    private int idPersonajePapa;
    private int idPersonajeMama;
    private int[] idVaritas;

    private String boggart;
    private Encantamiento[] listaEncantamiento;

    public Personaje(int id) {
        this.id = id;
    }

    public Personaje(int id, String nombre, String apellido, Date fechaNacimiento, Date fechaFallecimiento, String tipoSangre, String colorOjos, String colorCabello, String colorPiel, float estatura, String genero, String estadoCivil, String especie, boolean lentes, int idCasa, String titulo, String[] lealtades, int idPersonajePapa, int idPersonajeMama, int[] idVaritas, String boggart, Encantamiento[] listaEncantamiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecimiento = fechaFallecimiento;
        this.tipoSangre = tipoSangre;
        this.colorOjos = colorOjos;
        this.colorCabello = colorCabello;
        this.colorPiel = colorPiel;
        this.estatura = estatura;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.especie = especie;
        this.lentes = lentes;
        this.idCasa = idCasa;
        this.titulo = titulo;
        this.lealtades = lealtades;
        this.idPersonajePapa = idPersonajePapa;
        this.idPersonajeMama = idPersonajeMama;
        this.idVaritas = idVaritas;
        this.boggart = boggart;
        this.listaEncantamiento = listaEncantamiento;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public Date getFechaFallecimiento() {return fechaFallecimiento;}
    public String getTipoSangre() {return tipoSangre;}
    public String getColorOjos() {return colorOjos;}
    public String getColorCabello() {return colorCabello;}
    public String getColorPiel() {return colorPiel;}
    public float getEstatura() {return estatura;}
    public String getGenero() {return genero;}
    public String getEstadoCivil() {return estadoCivil;}
    public String getEspecie() {return especie;}
    public boolean isLentes() {return lentes;}
    public int getIdCasa() {return idCasa;}
    public String getTitulo() {return titulo;}
    public String[] getLealtades() {return lealtades;}
    public int getIdPersonajePapa() {return idPersonajePapa;}
    public int getIdPersonajeMama() {return idPersonajeMama;}
    public int[] getIdVaritas() {return idVaritas;}
    public String getBoggart() {return boggart;}
    public Encantamiento[] getListaEncantamiento() {return listaEncantamiento;}

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
    public boolean setApellido(String apellido) {
        if(!apellido.isEmpty()){
            this.apellido = apellido;
            return true;
        }else
            return false;
    }
    public boolean setFechaNacimiento(Date fechaNacimiento) {
        if(fechaNacimiento != null){
            this.fechaNacimiento = fechaNacimiento;
            return true;
        }else
            return false;
    }
    public boolean setFechaFallecimiento(Date fechaFallecimiento) {
        if(fechaFallecimiento != null){
            this.fechaFallecimiento = fechaFallecimiento;
            return true;
        }else
            return false;
    }
    public boolean setTipoSangre(String tipoSangre) {
        if(!tipoSangre.isEmpty()){
            this.tipoSangre = tipoSangre;
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
    public boolean setColorCabello(String colorCabello) {
        if(!colorCabello.isEmpty()){
            this.colorCabello = colorCabello;
            return true;
        }else
            return false;
    }
    public boolean setColorPiel(String colorPiel) {
        if(!colorPiel.isEmpty()){
            this.colorPiel = colorPiel;
            return true;
        }else
            return false;
    }
    public boolean setEstatura(float estatura) {
        if(estatura > 0){
            this.estatura = estatura;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero) {
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setEstadoCivil(String estadoCivil) {
        if(!estadoCivil.isEmpty()){
            this.estadoCivil = estadoCivil;
            return true;
        }else
            return false;
    }
    public boolean setEspecie(String especie) {
        if(!especie.isEmpty()){
            this.especie = especie;
            return true;
        }else
            return false;
    }
    public boolean setLentes(boolean lentes) {
        this.lentes = lentes;
        return true;
    }
    public boolean setIdCasa(int idCasa) {
        if(idCasa > 0){
            this.idCasa = idCasa;
            return true;
        }else
            return false;
    }
    public boolean setTitulo(String titulo) {
        if(!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }else
            return false;
    }
    public boolean setLealtades(String[] lealtades) {
        if(lealtades.length > 0){
            this.lealtades = lealtades;
            return true;
        }else
            return false;
    }
    public boolean setIdPersonajePapa(int idPersonajePapa) {
        if(idPersonajePapa > 0){
            this.idPersonajePapa = idPersonajePapa;
            return true;
        }else
            return false;
    }
    public boolean setIdPersonajeMama(int idPersonajeMama) {
        if(idPersonajeMama > 0){
            this.idPersonajeMama = idPersonajeMama;
            return true;
        }else
            return false;
    }
    public boolean setIdVaritas(int[] idVaritas) {
        if(idVaritas.length > 0){
            this.idVaritas = idVaritas;
            return true;
        }else
            return false;

    }
    public boolean setBoggart(String boggart) {
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setListaEncantamiento(Encantamiento[] listaEncantamiento) {
        if(listaEncantamiento.length > 0) {
            this.listaEncantamiento = listaEncantamiento;
            return true;
        }
        else
            return false;
    }

    public void showMessage(){

        String listLealtades = "[";
        if(lealtades!=null)
        for (int i = 0; i < lealtades.length; i++) {
            listLealtades += lealtades[i]+",";
        }
        listLealtades += "]";


        String listIdVaritas = "[";
        for (int i = 0; i < idVaritas.length; i++) {
            listIdVaritas += idVaritas[i]+",";
        }
        listIdVaritas += "]";


        String listEncantamientos = "[";
        for (int i = 0; i < listaEncantamiento.length; i++) {
            listEncantamientos += "{" +
                    " id:"+listaEncantamiento[i].getId()+
                    ", conjuro:"+listaEncantamiento[i].getConjuro()+
                    ", luz:"+listaEncantamiento[i].getColorLuz()+
                    ", efecto:"+listaEncantamiento[i].getEfecto()+
                    ", movimientoManos:"+listaEncantamiento[i].getMovimientoMano()+
                    "},";
        }
        listEncantamientos += "]";

        System.out.println(
                " id:"+id+
                        " nombre:"+nombre+
                        " apellido:"+apellido+
                        " fechaNacimiento:"+fechaNacimiento+
                        " fechaFallecimiento:"+fechaFallecimiento+
                        " tipoSangre:"+tipoSangre+
                        " colorOjos:"+colorOjos+
                        " colorCabello:"+colorCabello+
                        " colorPiel:"+colorPiel+
                        " estatura:"+estatura+
                        " genero:"+genero+
                        " estadoCivil:"+estadoCivil+
                        " especie:"+especie+
                        " lentes:"+lentes+
                        " idCasa:"+idCasa+
                        " titulo:"+titulo+
                        " lealtades:"+listLealtades+
                        " idPersonajePapa:"+idPersonajePapa+
                        " idPersonajeMama:"+idPersonajeMama+
                        " idVaritas:"+listIdVaritas+
                        " boggart:"+boggart+
                        " listaEncantamiento:"+listEncantamientos


        );
    }
}
