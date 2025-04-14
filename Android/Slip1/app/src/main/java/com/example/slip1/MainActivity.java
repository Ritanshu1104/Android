package com.example.slip1;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progressText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startTask(View view){
        MyTask myTask=new MyTask();
        myTask.execute();

    }
    private class MyTask extends AsyncTask<Void, Integer, Void> {


        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            progressDialog=new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Loading....");
            progressDialog.setTitle("ProgressDialog Example");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setCancelable(false);
            progressDialog.show();


        }
        @Override
        protected Void doInBackground(Void...params) {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(Integer...values){
            super.onProgressUpdate(values);
            int progress=values[0];
            progressDialog.setProgress(progress);
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            progressDialog.dismiss();
        }
    }
}