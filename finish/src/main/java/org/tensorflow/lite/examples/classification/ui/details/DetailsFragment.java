package org.tensorflow.lite.examples.classification.ui.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import org.tensorflow.lite.examples.classification.databinding.FragmentDetailsBinding;

public class DetailsFragment extends Fragment {

    private DetailsViewModel detailsViewModel;
    private FragmentDetailsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        detailsViewModel = new ViewModelProvider(this).get(DetailsViewModel.class);

        binding = FragmentDetailsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView lblDetails = binding.lblDetails;
        final TextView txtDetailsBrouwerij = binding.txtDetailsBrouwerij;
        final TextView txtDetailsInfo = binding.txtDetailsInfo;
        final TextView txtDetailsJaar = binding.txtDetailsJaar;
        final TextView txtDetailsPercent = binding.txtDetailsPercent;
        final ImageView imgDetails = binding.imgDetails;
        detailsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                lblDetails.setText(s);
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