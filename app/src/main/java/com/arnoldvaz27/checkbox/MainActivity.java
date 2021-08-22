package com.arnoldvaz27.checkbox;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkbox);

        checkBox.setChecked(true); //this will set the check box checked
        checkBox.setChecked(false); //this will set the check box unchecked

    }
}