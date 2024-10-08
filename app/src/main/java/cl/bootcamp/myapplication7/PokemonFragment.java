
package cl.bootcamp.myapplication7;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public abstract class PokemonFragment extends Fragment {

    protected abstract int getPokemonImage();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon, container, false);
        ImageView imageView = view.findViewById(R.id.pokemon_image);
        imageView.setImageResource(getPokemonImage());
        return view;
    }
}
