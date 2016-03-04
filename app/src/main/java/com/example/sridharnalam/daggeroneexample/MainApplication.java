package com.example.sridharnalam.daggeroneexample;

import android.app.Application;

import com.example.sridharnalam.daggeroneexample.modules.AppModules;

/**
 * Created by sridharnalam on 3/3/16.
 */
public class MainApplication extends Application {
    private static MainApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Injector.init(this, AppModules.list());
    }

    public static MainApplication getInstance() {
        return instance;
    }
}
