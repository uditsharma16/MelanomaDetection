package com.example.melanomadetection;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String user_name = editText.getText().toString();
        String password = editText2.getText().toString();
        String message="Hello "+user_name+" !!!";
        if (user_name.equals("1234")&&password.equals("1234")) {


        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);}
        else{new AlertDialog.Builder(this).setTitle("WRONG PASSWORD").setMessage("The Password You Entered Is Wrong").setNeutralButton("Close", null).show();}
    }
}
