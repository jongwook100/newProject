package org.techtown.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.LinkedList;

public class MyRecipeDemo extends AppCompatActivity {
    static LinkedList<EditText> bt = new LinkedList<>();
    Button buttona;
    LinearLayout layout;
    Context context;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe_demo);

        buttona = (Button)findViewById(R.id.button11);
        layout = (LinearLayout)findViewById(R.id.layout);
        context = this;

        editText1=(EditText)findViewById(R.id.editText4);
        bt.add(editText1);

        //에디트텍스트 추가하는 코드,링크드리스트로 구현
        buttona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText btn = new EditText(context);
                layout.addView(btn);
                bt.add(btn);
                btn.setText("내용");
            }
        });

        /*원하는 요리법 삭제
        editText2 = (EditText) findViewById(R.id.editText6);
        Button please = (Button)findViewById(R.id.button13);

        please.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        layout.removeView((View) bt.get(Integer.parseInt(editText2.getText().toString())-1));
                        bt.remove(Integer.parseInt(editText2.getText().toString())-1);
                    }
                }
        );*/

        //기존 레시피로 가는 코드
        Button rbutton =findViewById(R.id.jumprecipe);
        rbutton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), FoodListActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
