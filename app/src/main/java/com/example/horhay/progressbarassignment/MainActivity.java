package com.example.horhay.progressbarassignment;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView textView;
    private Button button;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using handler to handle the runnable
        handler = new Handler();

        //setting the progressBar variable to id progressBar in the xml diagram
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        //setting the textView variable to id textView in the xml diagram
        // the textview will be used to show the use of the getMax() function
        textView = (TextView) findViewById(R.id.textView);
        //setting the button variable to id start in the xml diagram
        // the button is used to start the progressBar runnable
        button = (Button) findViewById(R.id.start);

        //in the beginning I will set the progress bar to not show on the screen
        progressBar.setVisibility(View.INVISIBLE);
        //button is set if it is clicked it will perform the following
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the progress bar will be shown once teh button is clicked
                progressBar.setVisibility(View.VISIBLE);
                //thread starts
                new Thread(new Runnable() {
                    public void run() {
                        //goes through loop until progress status reaches 100
                        while (progressStatus < 100) {
                            //status goes up by 1 each time
                            progressStatus += 1;

                            //handler updates the textView with the progressStatus
                            handler.post(new Runnable() {
                                public void run() {
                                    //setProgress() sets the current value of the progressBar to an integer
                                    progressBar.setProgress(progressStatus);
                                    
                                    //getMax() gets the maximum value of the progressBar
                                    // and returns it as an integer value
                                    textView.setText(progressStatus+"/"+progressBar.getMax());
                                }
                            });
                            try {
                                // Sleep for 200 milliseconds.
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        //progress status resets once it reaches
                        // the value of progressBar.getMax() which is 100
                        if(progressStatus == progressBar.getMax()){
                            progressBar.setVisibility(View.GONE);
                            progressStatus = 0;
                        }
                    }
                }).start();
            }
        });
    }
}
