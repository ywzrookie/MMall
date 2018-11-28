package com.late.core.ui.recycler;

import java.util.ArrayList;

/**
 * Created by ywz on 18-11-27.
 * Describe:
 */
public abstract class DataConverter {

    protected final ArrayList<MultipleItemBean> BEANS = new ArrayList<>();
    private String mJsonData = null;

    public abstract ArrayList<MultipleItemBean> convert();

    public DataConverter setJsonData(String json) {
        this.mJsonData = json;
        return this;
    }

    protected String getJsonData() {
        if (mJsonData == null || mJsonData.isEmpty()) {
            throw new NullPointerException("Data Is Null");
        }
        return mJsonData;
    }

}
