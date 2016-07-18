package com.jru.mycoor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import activity.AppActivity;
import activity.ColActivity;
import activity.FabActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.btn_fab)
    Button btnFab;
    @InjectView(R.id.btn_app)
    Button btnApp;
    @InjectView(R.id.btn_col)
    Button btnCol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.btn_fab, R.id.btn_app, R.id.btn_col})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fab:
               startActivity(new Intent(this, FabActivity.class));
                break;
            case R.id.btn_app:
                startActivity(new Intent(this, AppActivity.class));
                break;
            case R.id.btn_col:
                startActivity(new Intent(this, ColActivity.class));
                break;
        }
    }
}
