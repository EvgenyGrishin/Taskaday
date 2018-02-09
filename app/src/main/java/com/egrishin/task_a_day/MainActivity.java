package com.egrishin.task_a_day;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
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
            LinearLayout ll = (LinearLayout) findViewById(R.id.ll1);
            // add edittext
            EditText et = new EditText(this);
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            et.setLayoutParams(p);
            et.setText("Text1");
            et.setId(numberOfLines - 1);
            ll.addView(et);
            numberOfLines--;
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
