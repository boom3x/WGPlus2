package de.ur.mi.android.excercises.starter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class Putzplan extends ActionBarActivity {

    private CalendarView calenderView;
    private TextView textView;
    private HashMap userList;
    private Button addUser;
    private Button changeUser;
    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putzplan);

        calenderView = (CalendarView) findViewById(R.id.calendarView);
        textView = (TextView) findViewById(R.id.textView);
        addUser = (Button) findViewById(R.id.button_add);
        changeUser = (Button) findViewById(R.id.button_change);
        user = (EditText) findViewById(R.id.editText);
    }

    private void initOnClickListener(){
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        changeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private int getWeeklyNumber(){
       return calenderView.getShownWeekCount();
    }

    private void assignUserForWeek(){
        userList.put(getWeeklyNumber(), user);
    }

    private void addUserToPutzplan(){
        assignUserForWeek();
    }

}
