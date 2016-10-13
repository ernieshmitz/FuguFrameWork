package com.example.tylerthompson.comp380project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key",et.getText().toString());
                startActivity(intent);
            }
        });*/
//        Animation animation = new TranslateAnimation(0, 500, 5,200);
//        animation.setDuration(2000);
//        animation.setRepeatCount(-1);
//
//        TextView myTextView = (TextView)findViewById(R.id.my_text_view);
//        myTextView.setAnimation(animation);s
        GameSession drBall = new GameSession(this);
        setContentView(drBall);
    }
}
