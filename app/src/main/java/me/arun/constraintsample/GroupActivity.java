package me.arun.constraintsample;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Group;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GroupActivity extends AppCompatActivity {


    Button btGroup1,btGroup2;
    Group group1,group2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        btGroup1=(Button)findViewById(R.id.buttonGroup1);
        btGroup2=(Button)findViewById(R.id.buttonGroup2);
        group1=(Group)findViewById(R.id.group);
        group2=(Group)findViewById(R.id.group2);
        btGroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(group1.getVisibility()== ConstraintLayout.GONE)
                    group1.setVisibility(ConstraintLayout.VISIBLE);
                else
                    group1.setVisibility(ConstraintLayout.GONE);
            }
        });
        btGroup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(group2.getVisibility()== ConstraintLayout.GONE)
                    group2.setVisibility(ConstraintLayout.VISIBLE);
                else
                    group2.setVisibility(ConstraintLayout.GONE);
            }
        });
//        ButterKnife.bind(this);
    }

//
//    @OnClick({R.id.buttonGroup1, R.id.buttonGroup2})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.buttonGroup1:
//                if(group.getVisibility()== ConstraintLayout.GONE)
//                    group.setVisibility(ConstraintLayout.VISIBLE);
//                else
//                    group.setVisibility(ConstraintLayout.GONE);
//                break;
//            case R.id.buttonGroup2:
//                if(group.getVisibility()== ConstraintLayout.GONE)
//                    group.setVisibility(ConstraintLayout.VISIBLE);
//                else
//                    group.setVisibility(ConstraintLayout.GONE);
//                break;
//        }
//    }
}
