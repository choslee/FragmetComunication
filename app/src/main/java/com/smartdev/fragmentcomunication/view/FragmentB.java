package com.smartdev.fragmentcomunication.view;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.smartdev.fragmentcomunication.R;
import com.smartdev.fragmentcomunication.viewModel.SharedViewModel;

public class FragmentB extends Fragment {

    private SharedViewModel mViewModel;
    private EditText editText;
    private Button button;

    public static FragmentB newInstance() {
        return new FragmentB();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_b_layout, container, false);

        editText = root.findViewById(R.id.etUnos);
        button = root.findViewById(R.id.btnAkcija);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.setUnos(editText.getText().toString());
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(getActivity()).get(SharedViewModel.class);
        mViewModel.getTextLiveDataObject().observe(getViewLifecycleOwner(), new Observer<String>() {

            /*Definisanje callback metode koja regauje na promenu LiveData objekta mText*/
            @Override
            public void onChanged(String s) {
                editText.setText(s);
            }
        });
    }

}