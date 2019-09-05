package com.example.androidlifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

//        private static final String TAG = "msg";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "onCreate()event called");
        setContentView(R.layout.activity_main);
    }

        @Override
        public void onStart() {
            super.onStart();
            Log.d("lifecycle", "onStart()event called");
        }

        @Override
        public void onPause() {
            super.onPause();
            Log.d("lifecycle", "onPause()event called");
        }

        @Override
        public void onResume() {
            super.onResume();
            Log.d("lifecycle", "onResume()event called");
        }

        @Override
        public void onStop() {
            super.onStop();
            Log.d("lifecycle", "onStop()event called");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d("lifecycle", "onDestroy()event called");
        }

    }

