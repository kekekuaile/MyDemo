package com.pd.mydemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //master测试
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.test1 :
                startActivity(new Intent(this,test1.class));
                break;

                default:
                    break;

        }
    }
}
