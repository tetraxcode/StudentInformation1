package com.example.abhin.studentinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthactivity extends AppCompatActivity {
private Button studentinfo,updateinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);
        studentinfo=(Button)findViewById(R.id.studentinfo);
        updateinfo=(Button)findViewById(R.id.updateinfo);

        studentinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourthactivity.this,seventhactivity.class);
                startActivity(intent);
            }
        });
        updateinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourthactivity.this,eightactivity.class);
                startActivity(intent);
            }
        });
    }
}
