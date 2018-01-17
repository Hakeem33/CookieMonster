package com.example.android.cookiemonster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int index = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.image_view_cookie);
        int [] cookiePics = {R.drawable.cookiemonstahfour,R.drawable.cookiemonstahthree,R.drawable.cookiemonstahtwo
                ,R.drawable.cookiemonstahone,R.drawable.cookiemonstahnone};
        Button Munch = (Button) findViewById(R.id.button_id);
        Button reset = (Button) findViewById(R.id.reset_id_id);
       final TextView textView = (TextView) findViewById(R.id.text_view_id);

        Munch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==5){
                    imageView.setImageResource(R.drawable.cookiemonstahfour);
                    textView.setText("Still Hungry");
                    index =4;
                } else if(index ==4){
                    imageView.setImageResource(R.drawable.cookiemonstahthree);
                    textView.setText("Better");
                    index =3;
                }else if (index==3){
                    imageView.setImageResource(R.drawable.cookiemonstahtwo);
                    textView.setText("Filling up");
                    index=2;
                }else if (index ==2){
                    imageView.setImageResource(R.drawable.cookiemonstahone);
                    textView.setText("Almost Full");
                    index=1;
                }else if(index==1){
                    imageView.setImageResource(R.drawable.cookiemonstahnone);
                    textView.setText("Buuurrp");
                    index=0;
                }
                }

        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    imageView.setImageResource(R.drawable.cookiemonstahfive);
                    textView.setText("I'm hungry");
                    index=5;
                }
            }
        });


        }

    }
