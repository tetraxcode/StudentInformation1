package com.example.abhin.studentinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ninthactivity extends AppCompatActivity {
private Button submit;
private EditText answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninthactivity);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(answer.getText().toString());
            }
        });
    }
    public void validate(String answer){
        if(answer.equals("Presidency")){
            Intent intent=new Intent(ninthactivity.this,tenthactivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(ninthactivity.this,sorry.class);
            startActivity(intent);
        }
    }
}
