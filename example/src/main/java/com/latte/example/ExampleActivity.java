package com.latte.example;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.diabin.fastec.example.R;
import com.late.core.activities.ProxyActivity;
import com.late.core.app.Latte;
import com.late.core.fragments.LatteFragment;

import launcher.LauncherDelegate;
import launcher.LauncherScrollDelegate;

public class ExampleActivity extends ProxyActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteFragment setRootDelegate() {
        return new LauncherDelegate();
    }


}
