package com.example.diies.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DiiES on 2017-10-29.
 */

public class Fragment1 extends Fragment {

    private static final String TAG = "Fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavdrugaAktywnosc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        btnNavFrag1 = (Button) view.findViewById(R.id.button1);
        btnNavFrag2 = (Button) view.findViewById(R.id.button2);
        btnNavFrag3 = (Button) view.findViewById(R.id.button3);
        btnNavdrugaAktywnosc = (Button) view.findViewById(R.id.button4);
        Log.d(TAG, "onCreateView: start.");

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Zmiana 1", Toast.LENGTH_SHORT).show();
                //navigane to fragment
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Zmiana 2", Toast.LENGTH_SHORT).show();
                //navigane to fragment
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Zmiana 3", Toast.LENGTH_SHORT).show();
                //navigane to fragment
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnNavdrugaAktywnosc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Zmiana 4", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DrugaAktywnosc.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
