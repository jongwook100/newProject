
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class SelectActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select2);


        Button move_two_one=findViewById(R.id.selectButton_Two_One);
        move_two_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity3.class);
                        startActivity(intent);
                    }
                }
        );

        Button move_two_two=findViewById(R.id.selectButton_Two_Two);
        move_two_two.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity3.class);
                        startActivity(intent);
                    }
                }
        );

        Button move_two_thr=findViewById(R.id.selectButton_Two_Thr);
        move_two_thr.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity3.class);
                        startActivity(intent);
                    }
                }
        );




    }

}