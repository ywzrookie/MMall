package com.latte.ec.main;

import android.graphics.Color;

import com.late.core.fragments.bottom.BaseBottomFragment;
import com.late.core.fragments.bottom.BottomItemFragment;
import com.late.core.fragments.bottom.BottomTabBean;
import com.late.core.fragments.bottom.ItemBuilder;
import com.latte.ec.main.index.IndexFragment;
import com.latte.ec.main.sort.SortFramgnt;

import java.util.LinkedHashMap;

/**
 * Created by ywz on 18-11-27.
 * Describe:
 */
public class EcBottomFragment extends BaseBottomFragment {
    @Override
    public LinkedHashMap<BottomTabBean, BottomItemFragment> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemFragment> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "主页"), new IndexFragment());
        items.put(new BottomTabBean("{fa-sort}", "分类"), new SortFramgnt());
        items.put(new BottomTabBean("{fa-compass}", "发现"), new IndexFragment());
        items.put(new BottomTabBean("{fa-shopping-cart}", "购物车"), new IndexFragment());
        items.put(new BottomTabBean("{fa-user}", "我的"), new IndexFragment());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexFragment() {
        return 0;
    }

    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }
}
