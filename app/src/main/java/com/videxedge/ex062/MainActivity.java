package com.videxedge.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import static com.videxedge.ex062.R.id.rBred;

/**
 * @author		Albert Levy <albert.school2015@gmail.com>
 * @version     1.0
 * @since		26/05/2020
 * Basic application to demonstrate:
 * 1. Reading switch state
 * 2. Reading RG state & RB checked
 */
public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    Switch sW;
    RadioGroup rG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.ll);
        sW = (Switch) findViewById(R.id.sW);
        rG = (RadioGroup) findViewById(R.id.rG);
    }

    public void btnchange(View view) {
        if (!sW.isChecked()) {
            change();
        }
    }

    public void rgchange(View view) {
        if (sW.isChecked()) {
            change();
        }
    }

    public void change(){
        int chk=rG.getCheckedRadioButtonId();
        switch (chk) {
            case R.id.rBred:
                ll.setBackgroundColor(Color.RED);
                break;
            case R.id.rBgreen:
                ll.setBackgroundColor(Color.GREEN);
                break;
            case R.id.rBblue:
                ll.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rBwhite:
                ll.setBackgroundColor(Color.WHITE);
                break;
            default:
                Toast.makeText(this, "You have to choose a color first", Toast.LENGTH_SHORT).show();
        }
    }
}