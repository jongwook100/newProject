package org.techtown.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Iterator;

public class blackrice extends AppCompatActivity {
    foodlist f = new foodlist();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackrice);

        TextView test = (TextView)findViewById(R.id.textView);

        test.setText(f.bt.get(0).getText().toString());
    }
}
