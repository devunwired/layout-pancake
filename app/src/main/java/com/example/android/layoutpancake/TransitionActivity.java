package com.example.android.layoutpancake;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;


public class TransitionActivity extends AppCompatActivity implements
        View.OnClickListener {

    ConstraintSet mSceneOne = new ConstraintSet();
    ConstraintSet mSceneTwo = new ConstraintSet();
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_transition_1);
        mSceneOne.clone(this, R.layout.layout_transition_1);
        mSceneTwo.clone(this, R.layout.layout_transition_2);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        findViewById(R.id.button_next).setOnClickListener(this);
        findViewById(R.id.button_cancel).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_next:
                transitionTo(mSceneTwo);
                break;
            case R.id.button_cancel:
                transitionTo(mSceneOne);
                break;
            default:
                // Do nothing
        }
    }

    private void transitionTo(ConstraintSet constraintSet) {
        TransitionManager.beginDelayedTransition(mConstraintLayout);
        constraintSet.applyTo(mConstraintLayout);
    }
}
