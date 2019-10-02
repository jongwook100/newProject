package org.techtown.newproject;


import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.newproject.R;

import java.util.LinkedList;

public class foodlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        Button a = (Button)findViewById(R.id.button1);
        Button b = (Button)findViewById(R.id.button2);

        LinkedList<Button> bt = new LinkedList<Button>();
        bt.add(a);
        bt.add(b);
        bt.get(0).setText("김치찌개");
        bt.get(1).setText("된장찌개");
    }
}