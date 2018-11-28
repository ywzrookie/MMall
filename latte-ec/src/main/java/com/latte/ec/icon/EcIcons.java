package com.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by ywz on 18-9-29.
 * Describe:
 */
public enum  EcIcons implements Icon {
    icon_aliPay('\ue702'),
    icon_scan('\ue657');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
