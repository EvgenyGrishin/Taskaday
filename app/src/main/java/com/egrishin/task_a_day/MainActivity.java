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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberOfLines = 3;

    public void plusTextField(View view) {

        if (numberOfLines > 0) {
            LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout1);

            // add edittext
            EditText et = new EditText(this);
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            et.setLayoutParams(p);
            et.setText("text" + numberOfLines);
            et.setId(numberOfLines - 1);
            ll.addView(et);
            numberOfLines--;

            //button counter

            Button secButton = (Button)findViewById(R.id.secondary_button);
            secButton.setText("" + numberOfLines);

        }

        else {
            Toast.makeText(this, "Not more than 3 secondary activities a day", Toast.LENGTH_LONG).show();
        }

    }

    public void getMainText(){
        EditText editText = (EditText) findViewById(R.id.main_task_line_view);
        String i = editText.getText().toString();
    }
}
