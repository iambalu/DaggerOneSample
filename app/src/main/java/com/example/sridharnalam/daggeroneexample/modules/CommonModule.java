package com.example.sridharnalam.daggeroneexample.modules;

import android.content.Context;

import com.example.sridharnalam.daggeroneexample.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sridharnalam on 3/3/16.
 */

@Module(library = true)
public class CommonModule {

    @Provides
    @Singleton
    Context provideAppContext() {
        return MainApplication.getInstance().getApplicationContext();
    }
}
