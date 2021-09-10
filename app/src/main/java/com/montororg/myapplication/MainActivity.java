package com.montororg.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.montororg.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private ActivityMainBinding binding;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();// con esto oculto la barra

        // aun no entiendo muy bien el inflater pero aqui se ingla el layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // uso de arrays para orientar Nombre con imagen ///////////
        int[] imagenid = {R.drawable.electronic,R.drawable.industrial,R.drawable.mecanica,R.drawable.sistemas};//se acomodan en un aray de 1x1 se asignan por nombre
        //desde la carpeta drawable

        String[] nombress= {"Electronica","Instrustrial","Mecanica","Sistemas"};

        ArrayList<Nombres> nombresArrayList = new ArrayList<>();

        // se  roeienta la relacion imagen nombre 1 con 1 , 2 con 2  usando for para el incremento segun la cantidad de iamgen
        for(int i= 0 ; i < imagenid.length;i++){

            Nombres nombres= new Nombres(nombress[i],imagenid[i]);// se crea un  histancia de la clase Nombres para traer el array
            nombresArrayList.add(nombres);// aqui en la clase main hace la asignacion ya que pidio o trajo los datos arrays de las otras clases



        }
        //se crea un objeto de la clase adaptadrolista para una funcion futura cuando se cliquee la imagen
        adaptadorlista adaptadorlista = new adaptadorlista(MainActivity.this,nombresArrayList);

        binding.ListaCarrerass.setAdapter(adaptadorlista);
        binding.ListaCarrerass.setClickable(true);
        binding.ListaCarrerass.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // aqui se manda a llamar las especificaciones de la carrera no se si llama fracmento o otra ventana de actividad



            }
        });


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);





    }




}