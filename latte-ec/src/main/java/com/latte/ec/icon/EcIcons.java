package com.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by ywz on 18-9-29.
 * Describe:
 */
public enum  EcIcons implements Icon {
    icon_huangguang('\ue625'),
    icon_huochezhan('\ue626');

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
