package cloud.techstar.dictionary.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cloud.techstar.dictionary.R;

public class OptionsFragment extends Fragment {


    public static OptionsFragment newInstance() {
        OptionsFragment optionsFragment = new OptionsFragment();
        return optionsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_options, container, false);
    }

}
