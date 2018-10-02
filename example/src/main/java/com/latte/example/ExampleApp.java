package com.latte.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.late.core.app.Latte;
import com.latte.ec.icon.FontEcModule;

/**
 * Created by ywz on 18-9-29.
 * Describe:
 */
public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http:127.0.0.1/")
                .configure();
    }
}
