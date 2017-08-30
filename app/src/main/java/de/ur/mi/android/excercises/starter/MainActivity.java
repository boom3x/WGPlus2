package de.ur.mi.android.excercises.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {



    private ImageButton myWgButton;
    private ImageButton einkaufslisteButton;
    private ImageButton kalenderButton;
    private ImageButton einstellungenButton;
    private ImageButton blackboard;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
        initOnClickListener();


    }

    private void initButtons(){
        myWgButton = (ImageButton) findViewById(R.id.myWG);
        einkaufslisteButton = (ImageButton) findViewById(R.id.einkaufsliste);
        kalenderButton = (ImageButton) findViewById(R.id.kalender);
        einstellungenButton = (ImageButton) findViewById(R.id.einstellungen);
        blackboard = (ImageButton) findViewById(R.id.blackboard);

    }

    private void initOnClickListener(){
        myWgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,meineWg.class);
                  startActivity(intent);
            }
        });

        einkaufslisteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Einkaufsliste.class);
                startActivity(intent);
            }
        });

        kalenderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   Intent intent = new Intent(MainActivity.this,toDoList.class);
                    startActivity(intent);
            }
        });

        einstellungenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //      Intent intent = new Intent(MainActivity.this,Einstellungen.class);
                //     startActivity(intent);
            }
        });
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }


}