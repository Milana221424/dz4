package Continent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz4.R;

import java.time.Instant;
import java.time.temporal.TemporalAdjuster;


public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgContinent;
    private TextView tvContinent;
    public ContinentViewHolder(@NonNull View itemView) {

        super(itemView);
        imgContinent = itemView.findViewById(R.id.img_continent);
        tvContinent = itemView.findViewById(R.id.tv_continent);
    }

    public void bind(Continent.ContinentModel continentModel){
        tvContinent.setText(continentModel.getName());
        Instant Glide = null;
        Glide.with((TemporalAdjuster) imgContinent).clone(continentModel.getImg()).into(imgContinent);
    }
}