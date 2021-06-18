package com.example.butterknife;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BlankFragment extends Fragment {

    @BindView(R.id.btnClick)
    Button btnClick;

    @BindView(R.id.txtClick)
    TextView txtClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btnClick)
    void showName() {
        txtClick.setText("IT wala...");
    }
}