package com.montororg.myapplication.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.montororg.myapplication.R;
import com.montororg.myapplication.databinding.FragmentHomeBinding;
import com.montororg.myapplication.ui.dashboard.DashboardFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private TextView miTexto;
    private LinearLayout linearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View miVista = binding.getRoot();

        miTexto = miVista.findViewById(R.id.texto);
        //cambiarTexto("Texto de inicio en la app");

        ImageView botoncito = miVista.findViewById(R.id.imagen2);
        botoncito.setOnClickListener(myListener);

        linearLayout = miVista.findViewById(R.id.linearlayout2);





        return miVista;
    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {

            /*
            FragmentManager fragmentManager = getParentFragmentManager();
            Fragment dashboard = new DashboardFragment();

            fragmentManager.beginTransaction().replace(linearLayout.getId(), dashboard).commitNow();*/


        }
    };

    private void cambiarTexto(String texto){
        miTexto.setText(texto);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}