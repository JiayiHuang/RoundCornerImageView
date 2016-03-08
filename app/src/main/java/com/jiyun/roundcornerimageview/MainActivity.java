package com.jiyun.roundcornerimageview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etAngle;
    EditText etRadius;
    RoundCornerImageView roundImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundImageView = (RoundCornerImageView) findViewById(R.id.roundImageView);
        etAngle = (EditText) findViewById(R.id.et_angle);
        etRadius = (EditText) findViewById(R.id.et_radius);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = etAngle.getText().toString().trim();
                etAngle.setText("");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int num = Integer.parseInt(str);
                switch (num) {
                    case 0:
                        roundImageView.setAngle(false, false, false, false);
                        break;
                    case 1:
                        roundImageView.setAngle(true, false, false, false);
                        break;
                    case 2:
                        roundImageView.setAngle(false, true, false, false);
                        break;
                    case 3:
                        roundImageView.setAngle(false, false, true, false);
                        break;
                    case 4:
                        roundImageView.setAngle(false, false, false, true);
                        break;
                    case 5:
                        roundImageView.setAngle(false, false, true, true);
                        break;
                    case 6:
                        roundImageView.setAngle(false, true, false, true);
                        break;
                    case 7:
                        roundImageView.setAngle(false, true, true, false);
                        break;
                    case 8:
                        roundImageView.setAngle(true, false, false, true);
                        break;
                    case 9:
                        roundImageView.setAngle(true, false, true, false);
                        break;
                    case 10:
                        roundImageView.setAngle(true, true, false, false);
                        break;
                    case 11:
                        roundImageView.setAngle(true, true, true, false);
                        break;
                    case 12:
                        roundImageView.setAngle(true, true, false, true);
                        break;
                    case 13:
                        roundImageView.setAngle(true, false, true, true);
                        break;
                    case 14:
                        roundImageView.setAngle(false, true, true, true);
                        break;
                    case 15:
                        roundImageView.setAngle(true, true, true, true);
                        break;
                }
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = etRadius.getText().toString().trim();
                if (TextUtils.isEmpty(str)) { return; }
                int num = Integer.parseInt(str);
                if (num < 0) { return; }
                else { roundImageView.setRectAdius(num); }
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
