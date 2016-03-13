package com.ck.appdevrecord.android;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.ck.appdevrecord.android.utils.Logger;

/**
 * Created by liqk on 15/11/22.
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        Logger.getLogger().d(this+"");

    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}
