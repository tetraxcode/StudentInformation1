package com.example.abhin.studentinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.text.BreakIterator;

public class secondactivity extends AppCompatActivity {

    public String codeFormat,codeContent;
    public TextView formatTxt, contentTxt;
    private Button lostid,signup;
    //private String i="2451-16-737-089";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        formatTxt = (TextView) findViewById(R.id.scan_format);
        contentTxt = (TextView) findViewById(R.id.scan_content);
        ;
        lostid = (Button) findViewById(R.id.lostid);
        signup=(Button)findViewById(R.id.signup);


        //traversing through pages
        lostid.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent2 = new Intent(secondactivity.this, thirdactivity.class);
                                          startActivity(intent2);
                                      }
                                  }
        );
        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent3=new Intent(secondactivity.this,fifthactivity.class);
                startActivity(intent3);
            }
        });
    }
    /**
     * event handler for scan button
     * @param view view of the activity
     */
    public void scanNow(View view){
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
        integrator.setPrompt("Scan a barcode");
        integrator.setResultDisplayDuration(0);
        integrator.setWide();  // Wide scanning rectangle, may work better for 1D barcodes
        integrator.setCameraId(0);  // Use a specific camera of the device
        integrator.initiateScan();
    }

    /**
     * function handle scan result
     * @param requestCode
     * @param resultCode
     * @param intent
     */
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        //retrieve scan result
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);

        if (scanningResult != null) {
            //we have a result and may have to modify it later according to the db
            String scanContent = scanningResult.getContents();
            //String scanFormat = scanningResult.getFormatName();

            // display it on screen later when i add the db and dont forget to wipe this
            //formatTxt.setText("FORMAT: " + scanFormat);
            contentTxt.setText("CONTENT: " + scanContent);
            Intent intent1=new Intent(secondactivity.this,fourthactivity.class);
            startActivity(intent1);

        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
