package com.latte.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.diabin.fastec.example.R;
import com.late.core.fragments.LatteFragment;

/**
 * Created by ywz on 18-10-2.
 * Describe:
 */
public class ExampleFragment extends LatteFragment{
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
