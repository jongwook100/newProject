
package org.techtown.newproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FinalActivity extends AppCompatActivity {

    public class FeelingHashSet {
        Set<Integer> vc;

        public FeelingHashSet() {
            vc = new HashSet<Integer>();
            this.doFeeling();
            this.printFeeling();
        }

        public void doFeeling() {
            Random ra = new Random();
            Integer ir = null;
            while (vc.size() < 6) {
                ir = new Integer(ra.nextInt(45) + 1);
                // 중복값 체크, HashSet의 add() 메소드는 데이터 저장시 중복값을 허용하지 않음
                vc.add(ir);
            }
        }

        public void printFeeling() {
            // Collections.sort()를 이용해 정렬하기 위해 Set -> List 으로 변환
            List<Integer> list = new ArrayList<Integer>(vc);
            Collections.sort(list); // 오름차순으로 정렬
            for (int i : list) {
                System.out.print(i + "\t");
            }
        }

        public void main(String[] args) {
            new FeelingHashSet();
        }
    }

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
                        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }

}