package cl.bootcamp.sprintfinalmodulo4.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.sprintfinalmodulo4.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cl.bootcamp.sprintfinalmodulo4.databinding.FragmentProductBinding;

public class ProductFragment extends Fragment {

    private FragmentProductBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProductBinding.inflate(inflater, container, false);
        setupVideo();
        return binding.getRoot();
    }

    private void setupVideo() {
        binding.videoView.setVideoPath("android.resource://" + requireContext().getPackageName() + "/" + R.raw.sample_video);
        binding.videoView.start();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
