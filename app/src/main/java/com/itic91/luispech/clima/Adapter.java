package com.itic91.luispech.clima;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis Pech on 04/06/2015.
 */
public class Adapter extends BaseAdapter {

    private Activity activity; //Activity desde el cual se hace referencia al llenado de la lista
    private ArrayList<SecundaryMain> arrayList; //Lista de items
    //Constructor con parametros que recibe la activity y los datos de los items
    public  Adapter(Activity activity, ArrayList<SecundaryMain>listaItems){
        super();
        this.activity=activity;
        this.arrayList=new ArrayList<SecundaryMain>(listaItems);
    }
    //Retorna el numero de items de la lista
    public int getCount(){
        return arrayList.size();
    }
    //Retorna el objeto SecundaryMain de la lista
    public Object getItem(int position){
        return arrayList.get(position);
    }
    //Retorna la posicion del item en la lista
    public long getItemId(int position){
        return position;
    }
    //Clase estatica que contiene los elementos de la lista
    public static class Fila{
        TextView txtTitle;
        TextView txtDescription;
        ImageView img;
    }
    //Metodo que retorna la vista formateada
    public View getView(int position, View ConvertView, ViewGroup parent){
        Fila view=new Fila();
        LayoutInflater inflator=activity.getLayoutInflater();
        SecundaryMain itm=arrayList.get(position);
        //Condicional para recrear la vista y no distorcionar el numero de elementos
        if (ConvertView==null){
            ConvertView = inflator.inflate(R.layout.activity_second, parent, false);
            view.txtTitle=(TextView) ConvertView.findViewById(R.id.txtTitle);
            view.txtDescription=(TextView) ConvertView.findViewById(R.id.txtDescription);
            view.img=(ImageView) ConvertView.findViewById(R.id.imgItem);
            ConvertView.setTag(view);
        }
        else{
            view=(Fila)ConvertView.getTag();
        }
        //Se asigna el dato proveniente del objeto SecundaryMain
        view.txtTitle.setText(itm.getTitle());
        view.txtDescription.setText(itm.getDescription());
        view.img.setImageResource(itm.getImg());
        //Retornamos la vista
        return ConvertView;
    }
}
