package Continent;

import static android.os.Build.VERSION_CODES.R;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<Continent.ContinentViewHolder> {
    private Continent.ContinentViewHolder holder;
    private int position;

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull Continent.ContinentViewHolder holder, int position) {

        this.holder = holder;
        this.position = position;
    }

    private ArrayList<Continent.ContinentModel> continentModel;


    public ContinentAdapter(){

    }

    @NonNull
    @Override
    public Continent.ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Continent.ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent,false));
    }

    @Override
    public void onBindViewHolder(int position) {
        onBindViewHolder(null,
                position);
    }

    @Override
    public void onBindViewHolder(@NonNull Continent.ContinentViewHolder holder, int position) {
        this.holder = holder;
        this.position = position;
        holder.bind(continentModel.get(position));

    }

    @Override
    public int getItemCount() {

        return continentModel.size();
    }
}