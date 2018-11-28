package com.latte.example.generators;

import com.late.core.wechat.templates.WXEntryTemplate;
import com.latte.annotations.EntryGenerator;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */

@EntryGenerator(
        packageName = "com.diabin.fastec.example",
        entryTemplete = WXEntryTemplate.class
)
public interface WeChatEntry {
}
