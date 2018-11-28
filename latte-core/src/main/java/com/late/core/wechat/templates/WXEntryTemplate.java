package com.late.core.wechat.templates;

import com.late.core.app.Latte;
import com.late.core.wechat.BaseWXEntryActivity;
import com.late.core.wechat.LatteWeChat;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */
public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWeChat.getInstance().getSignInCallback().onSignInSuccess(userInfo);
    }
}
