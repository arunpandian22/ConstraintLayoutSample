package me.arun.constraintsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.arun.constraintsample.sample.SampleActivity;

public class ChainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain);

    }

    public void onClickBarrier(View view){
        startActivity(new Intent(this,BarrierActivity.class));
    }
    public void onClickGuideLines(View view){
        startActivity(new Intent(this,GuideLinesActivity.class));
    }
    public void onClickGroups(View view){
        startActivity(new Intent(this,GroupActivity.class));
    }
    public void onClickSample(View view){
        startActivity(new Intent(this, SampleActivity.class));
    }

}
