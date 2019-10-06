package org.techtown.newproject;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class foodlist extends AppCompatActivity {


    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);

        final ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.blackrice),
                "흑미밥", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.whiterice),
                "쌀밥", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chalrice),
                "찰밥", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.japchae),
                "잡채밥", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bibimbap),
                "비빔밥", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggrice),
                "계란볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchirice),
                "김치볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.curry),
                "카레라이스", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shrimprice),
                "새우볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tunarice),
                "참치주먹밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchisoup),
                "김치찌개", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.djsoup),
                "된장찌개", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kongnamulsoup),
                "콩나물국", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggsoup),
                "계란국", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.miyeoksoup),
                "미역국", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soondofu),
                "순두부찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.budaesoup),
                "부대찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chungsoup),
                "청국장", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.galbitang),
                "갈비탕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.serrungtang),
                "설렁탕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.squidsoup),
                "오징어찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ukgaejang),
                "육계장", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.myeolchi),
                "멸치볶음", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.umook),
                "어묵볶음", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kongjaban),
                "콩자반", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.oimuchim),
                "오이무침", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.squidmuchim),
                "오징어채 볶음", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.hobakmuchim),
                "호박볶음", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bookuchaemuchim),
                "북어채무침", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chickenbokkem),
                "닭볶음탕", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.piggalbizzim),
                "돼지갈비찜", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sogalbizzim),
                "소갈비찜", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchizzim),
                "김치찜", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bulgoggi),
                "불고기", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jaeyook),
                "제육볶음", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.yookhwae),
                "육회", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soyook),
                "수육", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ramyeon),
                "라면", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.udong),
                "우동", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bibimnoodle),
                "비빔국수", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchimalnoodle),
                "김치말이국수", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.janchinoodle),
                "잔치국수", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kalnoodle),
                "칼국수", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ricenoodle),
                "쌀국수", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.spaghetti),
                "스파게티", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jajangmyeon),
                "짜장면", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jjambong),
                "짬뽕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.zzolmyeon),
                "쫄면", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.seafoodmyeon),
                "해물볶음우동", "700칼로리");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;

                // TODO : use item data.
                if(item.getTitle()=="흑미밥") {
                    Intent intent = new Intent(getApplicationContext(), blackrice.class);
                    startActivity(intent);

                }
            }
        });


        EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                ((ListViewAdapter)listview.getAdapter()).getFilter().filter(filterText) ;
            }
        });
    }
}