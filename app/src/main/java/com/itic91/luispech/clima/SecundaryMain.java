package com.itic91.luispech.clima;

/**
 * Created by Luis Pech on 04/06/2015.
 */
public class SecundaryMain {

    String title; // Título del item
    String description; // Descripción del item
    int img; // Imagen del ítem
    // Constructor por defecto de la clase
    public SecundaryMain(){}
    // Constructor con parámetros para inicializar el item
    public SecundaryMain(String _title, String _description, int _img){
        this.title = _title;
        this.description = _description;
        this.img = _img;
    }
    // Aqui inicia el GET y el SET para cada propiedad de la clase
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getImg() { return img; }
    public void setImg(int img) { this.img = img; }
}
