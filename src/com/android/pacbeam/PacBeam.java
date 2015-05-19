package com.android.pacbeam;

import android.app.Activity;
import android.os.Bundle;

public class PacBeam extends Activity {

    private PacBeamView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new PacBeamView(this);
        setContentView(mView);
    }
}
