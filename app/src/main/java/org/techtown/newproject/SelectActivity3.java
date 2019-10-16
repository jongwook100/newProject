
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class SelectActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select3);
        //
        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
        move_thr_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), FinalActivity.class);
                        startActivity(intent);
                    }
                }
        );
        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
        move_thr_two.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), FinalActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }




}