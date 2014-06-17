package com.example.RobolectricEspresso;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    private TextView text;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) findViewById(R.id.text);
    }

    public void onButtonClick(View view) {
        text.setText(getString(R.string.buttonClicked));
    }
}
