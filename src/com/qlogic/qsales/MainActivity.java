package com.qlogic.qsales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText tvUserName = (EditText) findViewById(R.id.tvUserName);
        final EditText tvPassword = (EditText) findViewById(R.id.tvPassword);
        
        Button btnContinue = (Button) findViewById(R.id.btnContinue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
