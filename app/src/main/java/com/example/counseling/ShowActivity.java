package com.example.counseling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    private ArrayList<MainData> arrayList;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();

        recyclerView = (RecyclerView)findViewById(R.id.rv_All);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();
        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);
        MainData mainData = new MainData(R.drawable.no_smoking,"경남 금연지원센터","찾아가는금연서비스(여성, 대학생, 학교밖청소년)\n 일반지원형금연캠프\n 전문치료형금연캠프","경상남도진주시주약동407-9 2층");
        arrayList.add(mainData);
        mainAdapter.notifyDataSetChanged();
        MainData mainData1 = new MainData(R.drawable.sunflower,"경남 서부 해바라기센터","성폭력, 가정폭력, 성매매관련의료, 심리상담, 수사및법률지원","경상남도진주시칠암동90 ");
        arrayList.add(mainData1);
        mainAdapter.notifyDataSetChanged();
        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}