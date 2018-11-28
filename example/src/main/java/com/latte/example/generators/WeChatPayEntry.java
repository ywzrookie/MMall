package com.latte.example.generators;

import com.late.core.wechat.templates.WXPayEntryTemplate;
import com.latte.annotations.PayEntryGenerator;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */

@PayEntryGenerator(
        packageName = "com.diabin.fastec.example",
        payEntryTemplete = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
