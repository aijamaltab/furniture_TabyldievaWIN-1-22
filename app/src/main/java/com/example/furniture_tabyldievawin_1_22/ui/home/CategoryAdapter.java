package com.example.furniture_tabyldievawin_1_22.ui.home;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniture_tabyldievawin_1_22.R;

import com.example.furniture_tabyldievawin_1_22.databinding.ItemCategoryBinding;
import com.example.furniture_tabyldievawin_1_22.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    ItemCategoryBinding binding;
    List<CategoryModel> main_list = new ArrayList<>();

    NavController navController;

    public void setMain_list(List<CategoryModel> main_list) {
        this.main_list = main_list;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.onBind(main_list.get(position));

    }

    @Override
    public int getItemCount() {
        return main_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemCategoryBinding binding;
        public ViewHolder(@NonNull ItemCategoryBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(CategoryModel categoryModel) {

            binding.titleCategory.setText(categoryModel.getTitle());
            binding.imageCategory.setImageResource(categoryModel.getImage());

            itemView.setOnClickListener(v -> {

                switch (categoryModel.getTitle()) {
                    case "Для спальни":
                        navController = Navigation.findNavController((Activity) itemView.getContext(),
                                R.id.nav_host_fragment_activity_main);
                        navController.navigate(R.id.action_navigation_home_to_navigation_bed_room);
                        break;

                    case "Для гостиной":
                        navController = Navigation.findNavController((Activity) itemView.getContext(),
                                R.id.nav_host_fragment_activity_main);
                        navController.navigate(R.id.action_navigation_home_to_zalFragment);
                        break;

                    case "Кухонная мебель":
                        navController = Navigation.findNavController((Activity) itemView.getContext(),
                                R.id.nav_host_fragment_activity_main);
                        navController.navigate(R.id.action_navigation_home_to_kuchFragment);
                        break;
                    case "Юношеские гарнитуры":
                        navController = Navigation.findNavController((Activity) itemView.getContext(),
                                R.id.nav_host_fragment_activity_main);
                        navController.navigate(R.id.action_navigation_home_to_kidsFragment);
                        break;


                    case "Садовая мебель":
                        navController = Navigation.findNavController((Activity) itemView.getContext(),
                                R.id.nav_host_fragment_activity_main);
                        navController.navigate(R.id.action_navigation_home_to_gardenFragment);

                        break;


                    default:
                }
            });
        }

    }
}
