package com.example.android.layoutpancake;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class LayoutDisplayActivity extends AppCompatActivity {
    private static final String TAG = LayoutDisplayActivity.class.getSimpleName();

    // Resource for the layout to display
    public static final String EXTRA_LAYOUT_ID = TAG + ".layoutId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getIntent().getStringExtra(Intent.EXTRA_TITLE));
        final int layoutId = getIntent().getIntExtra(EXTRA_LAYOUT_ID, 0);
        setContentView(layoutId);
    }

}
