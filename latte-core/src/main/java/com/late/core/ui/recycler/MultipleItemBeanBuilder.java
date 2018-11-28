package com.late.core.ui.recycler;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/**
 * Created by ywz on 18-11-27.
 * Describe:
 */
public class MultipleItemBeanBuilder {

    private static final LinkedHashMap<Object, Object> FIELDS = new LinkedHashMap<>();

    public MultipleItemBeanBuilder() {
        //先清楚之前的数据
        FIELDS.clear();
    }

    public final MultipleItemBeanBuilder setItemType(int itemType) {
        FIELDS.put(MultipleFields.ITEM_TYPE, itemType);
        return this;
    }

    public final MultipleItemBeanBuilder setField(Object key, Object value) {
        FIELDS.put(key, value);
        return this;
    }

    public final MultipleItemBeanBuilder setFields(LinkedHashMap<?, ?> fields) {
        FIELDS.putAll(fields);
        return this;
    }

    public final MultipleItemBean build() {
        return new MultipleItemBean(FIELDS);
    }

}
