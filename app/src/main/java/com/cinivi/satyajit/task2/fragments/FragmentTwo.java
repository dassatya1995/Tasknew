package com.cinivi.satyajit.task2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.cinivi.satyajit.task2.R;

public class FragmentTwo extends Fragment {

    SendMessage2 SM2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_fragment_two, container, false);
        return rootView;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button  btnPassData2= (Button) view.findViewById(R.id.btnPassData2);
        final EditText inData2 = (EditText) view.findViewById(R.id.inMessage2);
        btnPassData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SM2.sendData2(inData2.getText().toString().trim());
            }
        });

    }

    public interface SendMessage2 {
        void sendData2(String message2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SM2 = (SendMessage2) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }
}