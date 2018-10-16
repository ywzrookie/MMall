package com.late.core.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.late.core.app.Latte;

/**
 * Created by ywz on 18-10-15.
 * Describe:
 */
public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

}
