package cl.bootcamp.myapplication7;


import android.os.Bundle;

public class CharmanderFragment extends cl.bootcamp.myapplication7.PokemonFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getPokemonImage() {
        return R.drawable.chamanderl;
    }
}