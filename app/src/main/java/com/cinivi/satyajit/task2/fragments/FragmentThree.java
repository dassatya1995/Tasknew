package com.cinivi.satyajit.task2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cinivi.satyajit.task2.R;

public class FragmentThree extends Fragment {

    TextView txtDataFromA,txtDataFromB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_fragment_three, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtDataFromA = (TextView)view.findViewById(R.id.txtDataFromA);
        txtDataFromB = (TextView)view.findViewById(R.id.txtDataFromB);
    }

    public void displayReceivedData(String message)
    {
        txtDataFromA.setText("Data received: "+message);
    }
    public void displayReceivedData2(String message2)
    {
        txtDataFromB.setText("Data received: "+message2);
    }
}