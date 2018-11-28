package com.late.core.fragments;

public abstract class LatteFragment extends PermissionFragment {

    @SuppressWarnings("unchecked")
    public <T extends LatteFragment> T getParentDelegate() {
        return (T) getParentFragment();
    }

}
