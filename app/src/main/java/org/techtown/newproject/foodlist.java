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
                "김치볶음밥", "재료 : 김치, 밥, 참기름");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.curryrice),
                "카레라이스", "재료 : 카레가루, 밥");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bibimbap),
                "비빔밥", "재료 : 밥, 고추장, 야채");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.samchijorim),
                "삼치조림", "재료 : 삼치, 간장");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ukgaejang),
                "육개장", "재료 : 소고기, 물, 파");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.blackrice),
                "흑미밥", "재료 : 쌀, 흑미");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.miyeoksoup),
                "미역국", "재료 : 돼지고기, 간장");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.janchinoodle),
                "잔치국수", "재료 : 면, 간장");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chickenbokkem),
                "닭볶음탕", "재료 : 닭, 고추장");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chungsoup),
                "청국장", "재료 : 청국장, 물");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;

                // TODO : use item data.
                if(item.getTitle()=="김치볶음밥") {
                    Intent intent = new Intent(getApplicationContext(), RecipeActivity.class);
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