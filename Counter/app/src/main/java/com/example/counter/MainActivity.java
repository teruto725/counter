package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    private TextView counter_text;
    private Button push_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 追加：画面のアイテムと紐付け
        counter_text = (TextView)findViewById(R.id.txt_counter);
        push_btn = (Button)findViewById(R.id.btn_push);
        push_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                counter_text.setText(String.valueOf(count));
            }
        });

    }


}
