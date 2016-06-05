package com.bignerdranch.android.nerdlauncher.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bignerdranch.android.nerdlauncher.R;
import com.bignerdranch.android.nerdlauncher.base.SingleFragmentActivity;
import com.bignerdranch.android.nerdlauncher.fragment.NerdLauncherFragment;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NerdLauncherFragment();
    }
}
