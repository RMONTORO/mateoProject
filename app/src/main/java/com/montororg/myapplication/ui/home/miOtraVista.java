package com.montororg.myapplication.ui.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.montororg.myapplication.R;

public class miOtraVista {

    ImageView Imagen;
    TextView Nombre;

    miOtraVista(View v){

        Imagen = v.findViewById(R.id.imgcareer);
        Nombre = v.findViewById(R.id.career);



    }

}
