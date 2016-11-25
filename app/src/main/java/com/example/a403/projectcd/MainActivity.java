package com.example.a403.projectcd;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    RadioGroup Ra1;
    RadioButton r1;
    RadioButton r2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textview);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        R1 = (RatingBar)findViewById(R.id.ratingBar);
        C1 = (CalendarView)findViewById(R.id.calendarView);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        Ra1 = (RadioGroup)findViewById(R.id.radiogroup);
        l1 = (LinearLayout)findViewById(R.id.layout);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕", Toast.LENGTH_SHORT).show();
            }
        });






        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
            }
        });









        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()) {
                    l1.setBackgroundColor(Color.BLUE);
                }
                else {
                    l1.setBackgroundColor(Color.WHITE);
                }
            }
        });



        R1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), rating+"점",Toast.LENGTH_SHORT).show();
            }
        });



        Ra1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if(r1.isChecked()){
                    Toast.makeText(getApplicationContext(),"남자입니다.",Toast.LENGTH_SHORT).show();
                }
                else if(r2.isChecked()){
                    Toast.makeText(getApplicationContext(),"여자입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });






        C1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), String.valueOf(year+" 년"+(month+1)+"월"+dayOfMonth+"입니다"),Toast.LENGTH_SHORT).show();
            }
        });






    }


}



