package com.ck.appdevrecord.android.loadclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ck.appdevrecord.android.APP;
import com.ck.appdevrecord.android.MainActivity;
import com.ck.appdevrecord.android.R;

public class LoadClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_class);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String url = "file:///assets/a.html";


        ClassLoader loader1 = getClassLoader();
        ClassLoader loader2 = MainActivity.class.getClassLoader();
        ClassLoader loader3 = getApplication().getClassLoader();
        ClassLoader loader4 = APP.class.getClassLoader();
        ClassLoader loader5 = ClassLoader.getSystemClassLoader();
        ClassLoader loader6 = getApplication().getBaseContext().getClassLoader();
        ClassLoader loader7 = getApplication().getBaseContext().getClass().getClassLoader();


        Class cls = null;
        try {
            cls = loader1.loadClass("android.app.ActivityThread");
            ClassLoader loader8 = cls.getClassLoader();
            String hello = "\\u4f60\u597d";

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
