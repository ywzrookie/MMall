package com.latte.ec.main.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.late.core.fragments.LatteFragment;
import com.latte.ec.R;

import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;


/**
 * Created by ywz on 18-11-28.
 * Describe:
 */
public class GoodsDetailFragment extends LatteFragment {

    public static GoodsDetailFragment create() {
        return new GoodsDetailFragment();
    }

    @Override
    public Object setLayout() {
        return R.layout.fragment_goods;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultHorizontalAnimator();
    }
}
