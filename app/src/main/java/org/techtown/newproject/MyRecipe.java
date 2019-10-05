package org.techtown.newproject;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import org.techtown.newproject.R;
import org.w3c.dom.Text;

import java.util.LinkedList;

public class MyRecipe extends AppCompatActivity {
    static LinkedList<Button> bt = new LinkedList<Button>();
    Button button11;
    LinearLayout layout;
    Context context;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);


        Button j = (Button)findViewById(R.id.button1);

        button11= (Button)findViewById(R.id.button11);
        layout = (LinearLayout)findViewById(R.id.layout);
        context = this;
        //버튼을 링크드리스트로 구현하기

        bt.add(j);






    //버튼 추가하는 코드
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button btn = new Button(context);
                btn.setText("버튼"+String.valueOf("레시피 추가 버튼"));
                layout.addView(btn);
                bt.add(btn);
                btn.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View view){
                                Intent intent=new Intent(getApplicationContext(), MyRecipe1.class);
                                startActivity(intent);
                            }
                        }
                );
            }
        });
        //원하는 요리법 삭제 코드
        final EditText editText1 = (EditText) findViewById(R.id.editText);
        Button please = (Button)findViewById(R.id.button13);

        please.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        layout.removeView((View) bt.get(Integer.parseInt(editText1.getText().toString())));
                        bt.remove(Integer.parseInt(editText1.getText().toString()));
                    }
                }
        );
    }
}