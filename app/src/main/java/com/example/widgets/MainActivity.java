package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.myNewBtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Historian om skeppet Bismarck, 1942.");

                TextView textView = (TextView) findViewById(R.id.BismarckFate);
                textView.setText("Den sjönk.");

                ImageView simpleImageView=(ImageView) findViewById(R.id.BismarckBild);
                simpleImageView.setImageResource(R.drawable.bismarckship);


            }
        });
    }
}
