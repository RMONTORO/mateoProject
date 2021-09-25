package com.montororg.myapplication.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.montororg.myapplication.R;


public class miAdaptador extends ArrayAdapter<String> {

    Context context;
    int[] imagenes;
    String[] Nombre;

    public miAdaptador(Context context, String[] Nombre, int[] imagenes) {
        super(context, R.layout.lista_carreras, R.id.career, Nombre);

        this.context=context;
        this.Nombre=Nombre;
        this.imagenes=imagenes;


    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View vista = convertView;

        miOtraVista holder = null;

        if(vista == null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            vista = layoutInflater.inflate(R.layout.lista_carreras, parent, false);

            holder = new miOtraVista(vista);

            vista.setTag(holder);

        }
        else {
            holder = (miOtraVista) vista.getTag();
        }

        holder.Imagen.setImageResource(imagenes[position]);
        holder.Nombre.setText(Nombre[position]);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Elegiste: "+Nombre[position], Toast.LENGTH_SHORT).show();

            }
        });



        return vista;
    }
}
