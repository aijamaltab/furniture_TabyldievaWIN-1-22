package com.example.furniture_tabyldievawin_1_22.ui.Sale;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniture_tabyldievawin_1_22.MAdapter;
import com.example.furniture_tabyldievawin_1_22.R;
import com.example.furniture_tabyldievawin_1_22.databinding.FragmentSaleBinding;
import com.example.furniture_tabyldievawin_1_22.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class FragmentSale extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public FragmentSale() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }




    private void createList() {
        list_s.add(new FurnitureModel("zal","Новый диван 1" ,
                "1500", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_yellow));
        list_s.add(new FurnitureModel("zal","Новый диван 2" ,
                "1200", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_green));
        list_s.add(new FurnitureModel("zal","Новый диван 3" ,
                "1300", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_yellow));
        list_s.add(new FurnitureModel("zal","Новый диван 4" ,
                "1400", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_beige));
        list_s.add(new FurnitureModel("zal","Новый диван 5" ,
                "1100", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_yellow));
        list_s.add(new FurnitureModel("bed_room", "Кровать Arizona", "1200",
                "Кровать двухспальная размер 2.2м х 2.4м, производство Италия, матрас Mario Fabric, отделка: хлопок и атлас, набивной, специальный состав",
                R.drawable.bed_parlament));
        list_s.add(new FurnitureModel("bed_room", "Кровать Sky", "1550",
                "Кровать двухспальная размер 2.4м х 2.0м, производство Франция, матрас ComfortCloud, отделка: велюр, набивной, эргономичный дизайн",
                R.drawable.bed_blue));
        list_s.add(new FurnitureModel("zal","Диван Cry" ,
                "860", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_yellow));


    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_fragmentSale_to_navigation_home);
        });

    }
}