package com.liusara.lab05_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView onCreateTextView1, onStartTextView1, onResumeTextView1, onPauseTextView1, onStopTextView1,  onRestartTextView1, onDestroyTextView1;
    TextView onCreateTextView2, onStartTextView2, onResumeTextView2, onPauseTextView2, onStopTextView2,  onRestartTextView2, onDestroyTextView2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int onCreateCt1 = 0;
    int onStartCt1 = 0;
    int onResumeCt1 = 0;
    int onPauseCt1 = 0;
    int onStopCt1 = 0;
    int onRestartCt1 = 0;
    int onDestroyCt1 = 0;
    int onCreateCt2, onStartCt2, onResumeCt2, onPauseCt2, onStopCt2, onRestartCt2, onDestroyCt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateTextView1 = findViewById(R.id.onCreateView1);
        onStartTextView1 = findViewById(R.id.onStartView1);
        onResumeTextView1 = findViewById(R.id.onResumeView1);
        onPauseTextView1 = findViewById(R.id.onPauseView1);
        onStopTextView1 = findViewById(R.id.onStopView1);
        onRestartTextView1 = findViewById(R.id.onRestartView1);
        onDestroyTextView1 = findViewById(R.id.onDestroyView1);

        onCreateTextView2 = findViewById(R.id.onCreateView2);
        onStartTextView2 = findViewById(R.id.onStartView2);
        onResumeTextView2 = findViewById(R.id.onResumeView2);
        onPauseTextView2 = findViewById(R.id.onPauseView2);
        onStopTextView2 = findViewById(R.id.onStopView2);
        onRestartTextView2 = findViewById(R.id.onRestartView2);
        onDestroyTextView2 = findViewById(R.id.onDestroyView2);

        sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        onCreateCt2 = sharedPreferences.getInt("onCreateCt2", 0);
        onStartCt2 = sharedPreferences.getInt("onStartCt2", 0);
        onResumeCt2 = sharedPreferences.getInt("onResumeCt2", 0);
        onPauseCt2 = sharedPreferences.getInt("onPauseCt2", 0);
        onStopCt2 = sharedPreferences.getInt("onStopCt2", 0);
        onRestartCt2 = sharedPreferences.getInt("onRestartCt2", 0);
        onDestroyCt2 = sharedPreferences.getInt("onDestroyCt2", 0);

        onCreateCt1++;
        String newOnCreateMessage1 = "onCreate() count = " + onCreateCt1 + " since run";
        onCreateTextView1.setText(newOnCreateMessage1);

        onCreateCt2++;
        editor.putInt("onCreateCt2", onCreateCt2);
        editor.apply();
        String newOnCreateMessage2 = "onCreate() count = " + onCreateCt2 + " since installation";
        onCreateTextView2.setText(newOnCreateMessage2);

        String newOnStartMessage2 = "onStart() count = " + onStartCt2 + " since installation";
        onStartTextView2.setText(newOnStartMessage2);

        String newOnResumeMessage2 = "onResume() count = " + onResumeCt2 + " since installation";
        onResumeTextView2.setText(newOnResumeMessage2);

        String newOnPauseMessage2 = "onPause() count = " + onPauseCt2 + " since installation";
        onPauseTextView2.setText(newOnPauseMessage2);

        String newOnStopMessage2 = "onStop() count = " + onStopCt2 + " since installation";
        onStopTextView2.setText(newOnStopMessage2);

        String newOnRestartMessage2 = "onRestart() count = " + onRestartCt2 + " since installation";
        onRestartTextView2.setText(newOnRestartMessage2);

        String newOnDestroyMessage2 = "onDestroy() count = " + onDestroyCt2 + " since installation";
        onDestroyTextView2.setText(newOnDestroyMessage2);
    }

    protected void onStart() {
        super.onStart();
        onStartCt1++;
        String newOnStartMessage1 = "onStart() count = " + onStartCt1 + " since run";
        onStartTextView1.setText(newOnStartMessage1);

        onStartCt2++;
        editor.putInt("onStartCt2", onStartCt2);
        editor.apply();
        String newOnStartMessage2 = "onStart() count = " + onStartCt2 + " since installation";
        onStartTextView2.setText(newOnStartMessage2);
    }

    protected void onResume() {
        super.onResume();
        onResumeCt1++;
        String newOnResumeMessage1 = "onResume() count = " + onResumeCt1 + " since run";
        onResumeTextView1.setText(newOnResumeMessage1);

        onResumeCt2++;
        editor.putInt("onResumeCt2", onResumeCt2);
        editor.apply();
        String newOnResumeMessage2 = "onResume() count = " + onResumeCt2 + " since installation";
        onResumeTextView2.setText(newOnResumeMessage2);
    }

    protected void onPause() {
        super.onPause();
        onPauseCt1++;
        String newOnPauseMessage1 = "onPause() count = " + onPauseCt1 + " since run";
        onPauseTextView1.setText(newOnPauseMessage1);

        onPauseCt2++;
        editor.putInt("onPauseCt2", onPauseCt2);
        editor.apply();
        String newOnPauseMessage2 = "onPause() count = " + onPauseCt2 + " since installation";
        onPauseTextView2.setText(newOnPauseMessage2);
    }

    protected void onStop() {
        super.onStop();
        onStopCt1++;
        String newOnStopMessage1 = "onStop() count = " + onStopCt1 + " since run";
        onStopTextView1.setText(newOnStopMessage1);

        onStopCt2++;
        editor.putInt("onStopCt2", onStopCt2);
        editor.apply();
        String newOnStopMessage2 = "onStop() count = " + onStopCt2 + " since installation";
        onStopTextView2.setText(newOnStopMessage2);
    }

    protected void onRestart() {
        super.onRestart();
        onRestartCt1++;
        String newOnRestartMessage1 = "onRestart() count = " + onRestartCt1 + " since run";
        onRestartTextView1.setText(newOnRestartMessage1);

        onRestartCt2++;
        editor.putInt("onRestartCt2", onRestartCt2);
        editor.apply();
        String newOnRestartMessage2 = "onRestart() count = " + onRestartCt2 + " since installation";
        onRestartTextView2.setText(newOnRestartMessage2);
    }

    protected void onDestroy() {
        super.onDestroy();
        onDestroyCt1++;
        String newOnDestroyMessage1 = "onDestroy() count = " + onDestroyCt1 + " since run";
        onDestroyTextView1.setText(newOnDestroyMessage1);

        onDestroyCt2++;
        editor.putInt("onDestroyCt2", onDestroyCt2);
        editor.apply();
        String newOnDestroyMessage2 = "onDestroy() count = " + onDestroyCt2 + " since installation";
        onDestroyTextView2.setText(newOnDestroyMessage2);
    }
}
