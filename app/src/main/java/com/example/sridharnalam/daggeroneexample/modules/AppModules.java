package com.example.sridharnalam.daggeroneexample.modules;

/**
 * Created by sridharnalam on 3/3/16.
 */
public class AppModules {
    public static Object[] list() {
        return new Object[] {
                new CommonModule(), new SpecificModule()
        };
    }

    private AppModules(){
        // No instances.
    }
}
