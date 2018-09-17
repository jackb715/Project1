package edu.vcu.jackb.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccessControl extends AppCompatActivity {
    String numberInput = "";
    boolean hasSubmit = false;
    final String CORRECT_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);

        /*
            Declares arrays used to hold password information.
         */

        numberInput = "";

        /*
            Declares the buttons used on the AccessControl activity.
         */
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        Button submitButton = (Button) findViewById(R.id.submitButton);


        /*
            Sets the OnClickListeners for the buttons.
         */
        button1.setOnClickListener(numbers);
        button2.setOnClickListener(numbers);
        button3.setOnClickListener(numbers);
        button4.setOnClickListener(numbers);
        submitButton.setOnClickListener(numbers);


        System.out.print("1");


        }

    private View.OnClickListener numbers = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    numberInput += "1";
                    break;
                case R.id.button2:
                    numberInput += "2";
                    break;
                case R.id.button3:
                    numberInput += "3";
                    break;
                case R.id.button4:
                    numberInput += "4";
                    break;
                case R.id.submitButton:
                    Intent returnToMain = new Intent(AccessControl.this, MainActivity.class);
                    if(numberInput.equals(CORRECT_PASSWORD)){
                        returnToMain.putExtra("Update", "Welcome to the app   The app is unlocked.");
                        startActivity(returnToMain);
                    }
                    else{
                        startActivity(returnToMain);
                    }
                    break;
            }

        }
    };
}