package com.example.sridharnalam.daggeroneexample.modules;

import com.example.sridharnalam.daggeroneexample.DetailsFragment;
import com.example.sridharnalam.daggeroneexample.MainActivity;
import com.example.sridharnalam.daggeroneexample.MainApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sridharnalam on 3/3/16.
 */
@Module(complete = false,
        injects = {
                MainApplication.class,
                MainActivity.class
        }
)
public class SpecificModule {

    @Provides
    DetailsFragment provideDetailsFragment() {
        return new DetailsFragment();
    }
}
