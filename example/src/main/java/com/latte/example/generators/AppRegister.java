package com.latte.example.generators;

import com.late.core.wechat.templates.AppRegisterTemplate;
import com.latte.annotations.AppRegisterGenerator;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */

@AppRegisterGenerator(
        packageName = "com.diabin.fastec.example",
        registerTemplete = AppRegisterTemplate.class
)
public interface AppRegister {
}
