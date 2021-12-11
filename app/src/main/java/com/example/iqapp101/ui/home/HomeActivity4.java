package com.example.iqapp101.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.iqapp101.R;

/**
 * This activity is created for the Blog management
 */

public class HomeActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
        /**
         * The links created for the Blogs are made functional
         * Below mentioned are the functional text view
         */
        TextView t1 = (TextView) findViewById(R.id.textView6);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2 = (TextView) findViewById(R.id.textView7);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3 = (TextView) findViewById(R.id.textView8);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4 = (TextView) findViewById(R.id.textView9);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5 = (TextView) findViewById(R.id.textView10);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6 = (TextView) findViewById(R.id.textView11);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}