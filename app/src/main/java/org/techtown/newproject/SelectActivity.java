
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        //activity_select 에서 버튼 누르면 activity_select2로 이동하는 버튼 세개
        //여기서 잠시 이것저것 해보자 지금 해보는것 액티비티 하나로 합치는것
        //반복문으로 줄여보자
        //첫번째 레이아웃에서 첫번째 버튼
        Button move_one_one=findViewById(R.id.selectButton_One_One);
        move_one_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        setContentView(R.layout.activity_select2);//버튼 누르면 레이아웃 다음꺼

                        //두번째 레이아웃에서 첫번째 버튼
                        Button move_two_one=findViewById(R.id.selectButton_Two_One);
                        move_two_one.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);


                                        //세번째 버튼을 반복으로 JULYUBOZA

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 두번째 버튼
                        Button move_two_two=findViewById(R.id.selectButton_Two_Two);
                        move_two_two.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 세번째 버튼
                        Button move_two_thr=findViewById(R.id.selectButton_Two_Thr);
                        move_two_thr.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );
                    }
                }
        );
        //첫번째 레이아웃에서 두번째 버튼
        Button move_one_two=findViewById(R.id.selectButton_One_Two);
        move_one_two.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        setContentView(R.layout.activity_select2);//버튼 누르면 레이아웃 다음꺼

                        //두번째 레이아웃에서 첫번째 버튼
                        Button move_two_one=findViewById(R.id.selectButton_Two_One);
                        move_two_one.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 두번째 버튼
                        Button move_two_two=findViewById(R.id.selectButton_Two_Two);
                        move_two_two.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 세번째 버튼
                        Button move_two_thr=findViewById(R.id.selectButton_Two_Thr);
                        move_two_thr.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );
                    }
                }
        );

        //첫번째 레이아웃에서 세번째 버튼
        Button move_one_thr=findViewById(R.id.selectButton_One_Thr);
        move_one_thr.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        setContentView(R.layout.activity_select2);//버튼 누르면 레이아웃 다음꺼

                        //두번째 레이아웃에서 첫번째 버튼
                        Button move_two_one=findViewById(R.id.selectButton_Two_One);
                        move_two_one.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 두번째 버튼
                        Button move_two_two=findViewById(R.id.selectButton_Two_Two);
                        move_two_two.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        //두번째 레이아웃에서 세번째 버튼
                        Button move_two_thr=findViewById(R.id.selectButton_Two_Thr);
                        move_two_thr.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View view){
                                        setContentView(R.layout.activity_select3);

                                        //세번째 버튼에서 첫번째 버튼
                                        Button move_thr_one=findViewById(R.id.selectButton_Thr_One);
                                        move_thr_one.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );

                                        //세번째 버튼에서 두번째 버튼
                                        Button move_thr_two=findViewById(R.id.selectButton_Thr_Two);
                                        move_thr_two.setOnClickListener(
                                                new Button.OnClickListener(){
                                                    public void onClick(View view){
                                                        setContentView(R.layout.activity_final);
                                                    }
                                                }
                                        );
                                    }
                                }
                        );
                    }
                }
        );

    }

}
