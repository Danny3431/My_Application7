package cl.bootcamp.myapplication7;

import android.os.Bundle;

public class SquirtleFragment extends PokemonFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getPokemonImage() {
        return R.drawable.squirtle;
    }
}