package com.montororg.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class adaptadorlista extends ArrayAdapter<Nombres> {

//se crea un arrayadapter para la relacion de imagen palabra , creo que era mas facil hacer una imagen con la palara
    // ya puesta  xd
    public adaptadorlista(Context context, ArrayList<Nombres> nombresArrayList){


        super(context,R.layout.lista_carreras,nombresArrayList);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
// se declara un objeto  con nomnre de nombres
        Nombres nombres=getItem(position);

        if(convertView==null){

            convertView= LayoutInflater.from(getContext()).inflate(R.layout.lista_carreras,parent, false);


        }
// busca los ID's de los textviews y de los Imageviews
        ImageView imageView = convertView.findViewById(R.id.imgcareer);
        TextView nombrecareer = convertView.findViewById(R.id.career);

        // se le dan la ubicacion en la pantalla  se envia la imagen y tecto ala clase NOmbres ya ubicados y toda la onda
        imageView.setImageResource(nombres.imageneCarrera);
        nombrecareer.setText(nombres.carrerasName);



        return convertView;
    }
}
