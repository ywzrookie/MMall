package com.late.core.app;

import android.content.Context;
import android.os.Handler;


/**
 * Created by ywz on 18-9-29.
 * Describe:
 */
public final class Latte {

    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {return Configurator.getInstance();}

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return (Context) getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }

    public static Handler getHanlder() {
        return getConfiguration(ConfigKeys.HANDLER);
    }

}
