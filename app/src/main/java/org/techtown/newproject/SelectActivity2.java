
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class SelectActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select2);

        //
        //activity_select2 에서 버튼 누르면 activity_select3로 이동하는 버튼 세개dd
        //왜 깃에 안올라가 미친
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