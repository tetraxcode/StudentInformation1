package com.example.abhin.studentinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class thirdactivity extends AppCompatActivity {
private Button submit;
private String rollno;
private EditText rollnoedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(rollnoedit.getText().toString());
            }
        });

    }
    public void validate(String  rollno){
     if(rollno.equals("245116737089")){
         Intent intent=new Intent(thirdactivity.this,ninthactivity.class);
         startActivity(intent);
     }
    }
}
