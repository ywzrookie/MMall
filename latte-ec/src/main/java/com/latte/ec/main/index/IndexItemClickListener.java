package com.latte.ec.main.index;

import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.SimpleClickListener;
import com.late.core.fragments.LatteFragment;
import com.latte.ec.main.detail.GoodsDetailFragment;

/**
 * Created by ywz on 18-11-28.
 * Describe:
 */
public class IndexItemClickListener extends SimpleClickListener {

    private final LatteFragment FRAGMENT;

    private IndexItemClickListener(LatteFragment fragment) {
        this.FRAGMENT = fragment;
    }

    public static SimpleClickListener create(LatteFragment fragment) {
        return new IndexItemClickListener(fragment);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        final GoodsDetailFragment fragment = GoodsDetailFragment.create();
        FRAGMENT.start(fragment);
    }

    @Override
    public void onItemLongClick(BaseQuickAdapter adapter, View view, int position) {

    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

    }

    @Override
    public void onItemChildLongClick(BaseQuickAdapter adapter, View view, int position) {

    }
}
