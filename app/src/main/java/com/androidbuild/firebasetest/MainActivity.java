package com.androidbuild.firebasetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends Activity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        TextView tv = new TextView(this);
        tv.setText("Firebase connecte via AndroidBuild!");
        setContentView(tv);
    }
}
