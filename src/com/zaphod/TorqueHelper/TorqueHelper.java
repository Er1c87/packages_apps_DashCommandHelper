package com.zaphod.TorqueHelper;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.Override;

public class TorqueHelper extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume() {

        super.onResume();
        PackageManager pm = getPackageManager();
        Intent launch = pm.getLaunchIntentForPackage("org.prowl.torque");
        if (launch != null) {
            try {
                startActivity(launch);
            } catch (ActivityNotFoundException anf) {
                finish();
            }
        } else {
            finish();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    
}
