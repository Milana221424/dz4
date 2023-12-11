package Continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Country.CountryFragment;
import Country.OnClick;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<ContinentModel>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter();
        binding.recyclerView.setAdapter(continentAdapter);

    }

    private void loadData() {
        continentList.add(new ContinentModel("https://static.vecteezy.com/system/resources/previews/007/313/319/non_2x/eurasia-map-sketch-vector.jpg","Eurasia"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/4/49/Outline_North_America_%28PSF%29.png","North America"));
        continentList.add(new ContinentModel( "https://i.pinimg.com/originals/f6/13/20/f6132018356ae922147fab47e66e3b8a.jpg","South America"));
        continentList.add(new ContinentModel("https://5.imimg.com/data5/HS/RC/FH/SELLER-13454000/south-africa-outline-map-500x500.jpg","Africa"));
        continentList.add(new ContinentModel("https://ih1.redbubble.net/image.1763030781.3116/st,small,507x507-pad,600x600,f8f8f8.jpg","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key",position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,countryFragment).addToBackStack("null").commit();



    }
}