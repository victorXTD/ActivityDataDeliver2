package com.victor_xiao.activitydatadeliver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Victor_Xiao on 16/08/31.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("exdata");
        TextView textView =(TextView)findViewById(R.id.text2);
        textView.setText(str);
        setResult(RESULT_OK,intent);
    }
}
