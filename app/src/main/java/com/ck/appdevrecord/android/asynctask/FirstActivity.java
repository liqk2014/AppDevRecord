package com.ck.appdevrecord.android.asynctask;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.ck.appdevrecord.android.R;

public class FirstActivity extends AppCompatActivity {

    MyAsyncTask task1;
    MyAsyncTask task2;
    MyAsyncTask task3;
    MyAsyncTask task4;
    MyAsyncTask task5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

         task1=  new MyAsyncTask("task1");
          task2= new MyAsyncTask("task2");
          task3= new MyAsyncTask("task3");
          task4= new MyAsyncTask("task4");
         task5=    new MyAsyncTask("task5");

        task1.execute("");
        task2.execute("");

        task3.execute("");
        task4.execute("");
        task5.execute("");

        startActivity(new Intent(this,SecondActivity.class));


    }





    class MyAsyncTask extends android.os.AsyncTask<String ,Integer,String>{


        private String name;

        public MyAsyncTask(String name ){

            this.name= name;

        }

        @Override
        protected String doInBackground(String... params) {


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {


            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Log.d("taskName:",name);


        }
    }


    @Override
    protected void onStop() {
        super.onStop();

        task1.cancel(true);
        task2.cancel(true);

        task3.cancel(true);

        task4.cancel(true);

        task5.cancel(true);

    }
}
