package org.techtown.newproject;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.newproject.R;
import org.w3c.dom.Text;

import java.util.LinkedList;

public class foodlist extends AppCompatActivity {
    static LinkedList<Button> bt = new LinkedList<Button>();
    Button button11;
    Button button12;
    LinearLayout layout;
    Context context;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);

        Button a = (Button)findViewById(R.id.button1);
        Button b = (Button)findViewById(R.id.button2);
        Button c = (Button)findViewById(R.id.button3);
        Button d = (Button)findViewById(R.id.button4);
        Button e = (Button)findViewById(R.id.button5);
        Button f = (Button)findViewById(R.id.button6);
        Button g = (Button)findViewById(R.id.button7);
        Button h = (Button)findViewById(R.id.button8);
        Button i = (Button)findViewById(R.id.button9);
        Button j = (Button)findViewById(R.id.button10);

        button11= (Button)findViewById(R.id.button11);
        layout = (LinearLayout)findViewById(R.id.layout);
        context = this;
        //버튼을 링크드리스트로 구현하기

        bt.add(a);
        bt.add(b);
        bt.add(c);
        bt.add(d);
        bt.add(e);
        bt.add(f);
        bt.add(g);
        bt.add(h);
        bt.add(i);
        bt.add(j);
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



        //흑미밥 레시피 넘어가는 코드
        a.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), blackrice.class);
                        startActivity(intent);
                    }
                }
        );



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
                               Intent intent=new Intent(getApplicationContext(), MyRecipe.class);
                               startActivity(intent);
                           }
                       }
               );
           }
       });

    }
}