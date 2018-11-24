package com.late.core.ui.launcher;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by ywz on 18-11-24.
 * Describe:
 */
public class LauncherHolderCreator implements CBViewHolderCreator<LauncherHolder> {
    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }
}
