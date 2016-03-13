package com.ck.appdevrecord.android.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ck.appdevrecord.android.R;
import com.ck.appdevrecord.android.utils.Logger;

public class LifeCircle extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_circle);
      toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       int height = toolbar.getHeight();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        int height = toolbar.getHeight();
        Logger.getLogger().d(height+"");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        int height = toolbar.getHeight();
        Logger.getLogger().d(height+"");


    }

    @Override
    protected void onResume() {
        super.onResume();
        int height = toolbar.getHeight();

        Logger.getLogger().d(height+"");

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
