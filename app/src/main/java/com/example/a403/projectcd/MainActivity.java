package com.example.a403.projectcd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕", Toast.LENGTH_SHORT).show();
            }
        });
        t1 = (TextView) findViewById(R.id.textview);
        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
       c1 = (CheckBox) findViewById(R.id.checkBox);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public  void onCheckedChanged(CompoundButton button,boolean isChecked){
            int btnDrawable = android.R.drawable.checkbox_off_background;

                    if(isChecked)
                    {
                        btnDrawable = android.R.drawable.checkbox_on_background;
                    }


            }
        });
    }
}



