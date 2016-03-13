package com.ck.appdevrecord.android.asynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.ck.appdevrecord.android.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        new MyAsyncTask("task6").execute();

    }




    class MyAsyncTask extends android.os.AsyncTask<String ,Integer,String>{


        private String name;

        public MyAsyncTask(String name ){

            this.name= name;

        }

        @Override
        protected String doInBackground(String... params) {




            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Log.d("taskName:", name);


        }
    }

}
