package com.example.sridharnalam.daggeroneexample;

import dagger.ObjectGraph;

/**
 * Created by sridharnalam on 3/3/16.
 */
public class Injector {
    private static ObjectGraph objectGraph = null;

    public static void init(final Object... modules){
        objectGraph = ObjectGraph.create(modules);

        // Inject statics
        objectGraph.injectStatics();
    }

    public static void init(final Object target){
        objectGraph.inject(target);
    }

    public static void init(final Object target, Object... modules){
        init(modules);
        init(target);
    }

    public static void inject(final Object target){
        objectGraph.inject(target);
    }
}
