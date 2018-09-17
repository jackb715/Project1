package edu.vcu.jackb.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textView);
        Button unlockButton = (Button) findViewById(R.id.unlockButton);
        unlockButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccessControl.class);
                startActivity(intent);
            }
        });
        try {
            Bundle bundle = getIntent().getExtras();
            String newText = bundle.getString("Update");
            text.setText(newText);
        }
        catch(NullPointerException e){
            //do nothing
        }


    }


}
