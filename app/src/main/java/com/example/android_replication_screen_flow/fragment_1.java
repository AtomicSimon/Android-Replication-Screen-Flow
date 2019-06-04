package com.example.android_replication_screen_flow;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_1 extends Fragment {


    public fragment_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_1, container, false);

        view.findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_fragment_1_to_fragment_2);
            }
        });

        return view;
    }

}
