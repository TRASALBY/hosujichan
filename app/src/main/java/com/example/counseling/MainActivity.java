package com.example.counseling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_ChangWon).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //창원 클릭시
                str = "창원";
                Intent intent = new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("region",str);
                startActivity(intent); //액티비티 이동
            }
        });
        findViewById(R.id.btn_JinJu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //진주 클릭시
                str = "진주";
                Intent intent = new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("region",str);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}