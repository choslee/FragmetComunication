package com.smartdev.fragmentcomunication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.smartdev.fragmentcomunication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Adding fragments to container*/
        getSupportFragmentManager().beginTransaction()
                .add(R.id.clContainerA, FragmentA.newInstance())
                .add(R.id.clContainerB, FragmentB.newInstance())
                .commit();
    }
}