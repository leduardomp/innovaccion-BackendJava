package practicaHarry;

import java.util.Arrays;

public class Varita {

    private int id;
    private String nombre;
    private String[] materiales;
    private float largo;
    private String fabricante;

    public Varita(int id, String nombre, String[] materiales, float largo, String fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.materiales = materiales;
        this.largo = largo;
        this.fabricante = fabricante;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String[] getMateriales() {return materiales;}
    public float getLargo(){return largo;}
    public String getFabricante() {return fabricante;}

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

    public boolean setMateriales(String[] materiales) {
        if(materiales.length > 0){
            this.materiales = materiales;
            return true;
        }else
            return false;
    }

    public boolean setFabricante(String fabricante) {
        if(!fabricante.isEmpty()){
            this.fabricante = fabricante;
            return true;
        }else
            return false;
    }

    public void showMessage(){

        String listMateriales = "[";
        for (int i = 0; i < materiales.length; i++) {
            listMateriales += materiales[i]+",";
        }
        listMateriales += "]";

        System.out.println(
                " id:"+id+
                " nombre:"+nombre+
                " materiales:"+listMateriales+
                " largo:"+largo+
                " fabricante:"+fabricante
        );
    }
}
