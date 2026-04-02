package com.kwad.components.ad.splashscreen;

import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class SplashPlayModuleCache {
    private HashMap<String, WeakReference<com.kwad.components.ad.splashscreen.e.a>> Cc;

    /* loaded from: classes.dex */
    enum Holder {
        INSTANCE;
        
        private SplashPlayModuleCache mInstance = new SplashPlayModuleCache((byte) 0);

        Holder() {
        }

        final SplashPlayModuleCache getInstance() {
            return this.mInstance;
        }
    }

    private SplashPlayModuleCache() {
        this.Cc = new HashMap<>(1);
    }

    /* synthetic */ SplashPlayModuleCache(byte b) {
        this();
    }
}
