package com.example.furniture_tabyldievawin_1_22.ui.dashboard;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_tabyldievawin_1_22.MAdapter;
import com.example.furniture_tabyldievawin_1_22.R;
import com.example.furniture_tabyldievawin_1_22.databinding.FragmentBedRoomBinding;
import com.example.furniture_tabyldievawin_1_22.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Red Flame", "1690",
                "Кровать двухспальная размер 2.6м х 2.4м, производство Турция, матрас набивной пружинный, кокосовая стружка",
                R.drawable.bed_red_flame));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Red Sunrise", "1100",
                "Кровать двухспальная размер 2.6м х 2.4м, производство Италия, матрас Mario Fabric, отделка: натуральная кожа и гобелен, набивной, специальный состав",
                R.drawable.bed_red_sunrise));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Plot", "1340",
                "Кровать двухспальная размер 2.2м х 2.15м, производство Италия, матрас Riotello, отделка: хлопок и гобелен, набивной, специальный состав",
                R.drawable.bed_plot));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Parlament", "1200",
                "Кровать двухспальная размер 2.2м х 2.4м, производство Италия, матрас Mario Fabric, отделка: хлопок и атлас, набивной, специальный состав",
                R.drawable.bed_parlament));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Blue Dream", "1550",
                "Кровать двухспальная размер 2.4м х 2.0м, производство Франция, матрас ComfortCloud, отделка: велюр, набивной, эргономичный дизайн",
                R.drawable.bed_blue));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Harmony", "1780",
                "Кровать двухспальная размер 2.5м х 2.2м, производство Германия, матрас OrthoLux, отделка: натуральная кожа, набивной, анатомическая форма",
                R.drawable.bed_harmony));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}