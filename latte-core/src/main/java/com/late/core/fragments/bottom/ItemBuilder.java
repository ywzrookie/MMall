package com.late.core.fragments.bottom;

import java.util.LinkedHashMap;

/**
 * Created by ywz on 18-11-27.
 * Describe:
 */
public final class ItemBuilder {

    private final LinkedHashMap<BottomTabBean, BottomItemFragment> ITEMS = new LinkedHashMap<>();

    static ItemBuilder builder() {
        return new ItemBuilder();
    }

    public final ItemBuilder addItem(BottomTabBean bean, BottomItemFragment fragment) {
        ITEMS.put(bean, fragment);
        return this;
    }

    public final ItemBuilder addItems(LinkedHashMap<BottomTabBean, BottomItemFragment> items) {
        ITEMS.putAll(items);
        return this;
    }

    public final LinkedHashMap<BottomTabBean, BottomItemFragment> build() {
        return ITEMS;
    }

}
