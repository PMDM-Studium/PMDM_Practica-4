package es.studium.pmdm_practicica4.ui.Cientifico;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.studium.pmdm_practicica4.R;

public class CientificoFragment extends Fragment {

    private CientificoViewModel mViewModel;

    public static CientificoFragment newInstance() {
        return new CientificoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cientifico_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CientificoViewModel.class);
        // TODO: Use the ViewModel
    }

}