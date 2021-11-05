package org.tensorflow.lite.examples.classification.ui.beer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import org.tensorflow.lite.examples.classification.databinding.FragmentBeerBinding;

public class BeerFragment extends Fragment {

    private BeerViewModel beerViewModel;
    private FragmentBeerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        beerViewModel =
                new ViewModelProvider(this).get(BeerViewModel.class);

        binding = FragmentBeerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView txtBeer = binding.txtBeer;
        final SearchView searchView = binding.searchView;
        final ListView listBeers = binding.lstBeers;
        beerViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtBeer.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}