
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        //activity_select 에서 버튼 누르면 activity_select2로 이동하는 버튼 세개
        Button move_one_one=findViewById(R.id.selectButton_One_One);
        move_one_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity2.class);
                        startActivity(intent);
                    }
                }
        );

        Button move_one_two=findViewById(R.id.selectButton_One_Two);
        move_one_two.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity2.class);
                        startActivity(intent);
                    }
                }
        );

        Button move_one_thr=findViewById(R.id.selectButton_One_Thr);
        move_one_thr.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity2.class);
                        startActivity(intent);
                    }
                }
        );

    }

}
