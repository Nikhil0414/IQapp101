package com.example.iqapp101.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.iqapp101.R;
/**
 * This is the Home page activity of the application named under HomeFragment
 */
public class HomeFragment extends Fragment {

    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    // below are the buttons created on the homepage

    public void onStart() {

        super.onStart();

        // button for event view

        Button button =(Button) context.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,HomeActivity1.class);
                startActivity(intent);
            }
        });

        // button for Project view

        Button button2 =(Button) context.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,HomeActivity2.class);
                startActivity(intent);
            }
        });

        // button for Team view

        Button button3 =(Button) context.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,HomeActivity3.class);
                startActivity(intent);
            }
        });

        // button for Blog view

        Button button4 =(Button) context.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,HomeActivity4.class);
                startActivity(intent);
            }
        });

        // button for Skills view

        Button button5 =(Button) context.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,HomeActivity5.class);
                startActivity(intent);
            }
        });

    }



}
