package com.maximumscrubbage.bw.clipboard2websearch;

import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        if (clipboardManager != null && clipboardManager.getPrimaryClip() != null) {
            editText.setText(clipboardManager.getPrimaryClip().toString());
            button.setText(R.string.searchmyclipboard);
        }

    }
}
