
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        //레시피 보러가는 버튼


        //최종 메뉴 추천후 돌아가기 버튼
        Button move_thr_one=findViewById(R.id.selectButton_Fin_Two);
        move_thr_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), SelectActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }



}