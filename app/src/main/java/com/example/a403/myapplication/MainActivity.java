package com.example.a403.myapplication;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    TextView t1, t2;
    CheckBox c1;
    RatingBar r1;
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕 세상", Toast.LENGTH_SHORT).show();
            }
        });

        b1 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕?", Toast.LENGTH_SHORT).show();
            }
        });

        b2 = (Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "제 이름은 권혁주 입니다", Toast.LENGTH_SHORT).show();
            }
        });

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked() == true){
                    Toast.makeText(getApplicationContext(), "체크되었습니다", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "체크 해제 되었습니다", Toast.LENGTH_SHORT).show();
                }

            }
        });

        r1 = (RatingBar)findViewById(R.id.ratingBar);
        t2 = (TextView)findViewById(R.id.textView2);
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                t2.setText("별점은 : " + rating);
            }
        });

        calendar = (CalendarView)findViewById(R.id.calendarView);
    }
}
