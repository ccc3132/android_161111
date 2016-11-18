package com.example.a403.projectcd;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    CheckBox c1;
    LinearLayout l1;
    RatingBar R1;
    CalendarView C1;
    RadioButton r1;
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
        R1 = (RatingBar)findViewById(R.id.ratingBar);
        R1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, String.valueOf(R1.getRating()), Toast.LENGTH_SHORT).show();
            }
        });
        C1 = (CalendarView)findViewById(R.id.calendarView);
        C1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), String.valueOf(year+" 년"+month+"월"+dayOfMonth+"입니다"),Toast.LENGTH_SHORT).show();
            }
        });
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"남자입니다.",Toast.LENGTH_SHORT);
            }
        });
        r1 = (RadioButton)findViewById(R.id.radioButton2);
        r1.setOnClickListener(new View.OnClickListener(){

            public  void onClick(View v){
                Toast.makeText(getApplicationContext(),"여자입니다.",Toast.LENGTH_SHORT);
            }
        });
    }
}



