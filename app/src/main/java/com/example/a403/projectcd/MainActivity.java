package com.example.a403.projectcd;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    CheckBox c1;
    LinearLayout l1;
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
       c1 = (CheckBox)findViewById(R.id.checkBox);
        c1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(c1.isChecked()) {
                    l1.setBackgroundColor(Color.BLUE);
                }
                else {
                    l1.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }
}



