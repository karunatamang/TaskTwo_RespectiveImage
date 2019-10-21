package com.example.tasktwo_respectiveimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radio1, radio2, radio3;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio1 = findViewById(R.id.radiobird);
        radio2 = findViewById(R.id.radiotiger);
        radio3 = findViewById(R.id.radiosnake);

        imageview =findViewById(R.id.image);

        radio1.setOnClickListener(this);
        radio2.setOnClickListener(this);
        radio3.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radiobird:
                imageview.setImageResource(R.drawable.bird);
                break;
            case R.id.radiotiger:
                imageview.setImageResource(R.drawable.tiger);
                break;
            case R.id.radiosnake:
                imageview.setImageResource(R.drawable.snake);
                break;




        }

    }
}
