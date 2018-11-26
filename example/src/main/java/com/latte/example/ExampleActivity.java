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
import com.late.core.ui.launcher.ILauncherListener;
import com.late.core.ui.launcher.OnLauncherFinishTag;

import launcher.LauncherDelegate;
import launcher.LauncherScrollDelegate;
import sign.ISignListener;
import sign.SignInFragment;
import sign.SignUpFragment;

public class ExampleActivity extends ProxyActivity implements
        ISignListener,
        ILauncherListener {


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


    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SIGNED:
                Toast.makeText(this, "启动结束，用户登录", Toast.LENGTH_SHORT).show();
                startWithPop(new ExampleFragment());
                break;
            case NOT_SIGNED:
                Toast.makeText(this, "启动结束，用户没登录", Toast.LENGTH_SHORT).show();
                startWithPop(new SignInFragment());
                break;
                default:
                    break;
        }
    }
}
