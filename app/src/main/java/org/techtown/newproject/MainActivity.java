package org.techtown.newproject;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.text.SimpleDateFormat;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.newproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, org.techtown.newproject.LoadingActivity.class));

        TextView time = findViewById(R.id.text_time);

        Long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEE");

        String getTime = sdf.format(date);

        time.setText("Today"+getTime);
        //
        Button q=findViewById(R.id.sssbutton);
        q.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity.class);
                        startActivity(intent);
                    }
                }
        );
        //

        Button infoButton=findViewById(R.id.informbutton);
        infoButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), foodlist.class);
                        startActivity(intent);
                    }
                }
        );
        Button mybutton =findViewById(R.id.myrbutton);
        mybutton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), MyRecipe.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
