package com.egrishin.task_a_day;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numberOfLinesLeft = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void summonButton(View view){

            LinearLayout ll2 = (LinearLayout) findViewById(R.id.secondaryButton);
            Button secbutt = new Button(this);

            secbutt.setText("" + numberOfLinesLeft);
            ll2.addView(secbutt);
            int i = secbutt.getId();

            secbutt.setOnClickListener(new View.OnClickListener() {

                @Override
                    public void onClick(View view){

                    plusTextField();

                    return;
                }
            });

            if (numberOfLinesLeft > 0) summonButton(View);

            else return;

            }


    public void plusTextField() {

            LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout1);

            // add edittext
            EditText et = new EditText(this);
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            et.setLayoutParams(p);
            et.setText("text" + numberOfLinesLeft);
            et.setId(numberOfLinesLeft - 1);
            ll.addView(et);
            numberOfLinesLeft--;
            return;

    }

    public void getMainText(){
        EditText editText = (EditText) findViewById(R.id.main_task_line_view);
        String i = editText.getText().toString();
    }
}
