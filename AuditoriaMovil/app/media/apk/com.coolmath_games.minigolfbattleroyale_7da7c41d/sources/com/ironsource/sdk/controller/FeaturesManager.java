package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class FeaturesManager {
    private static volatile FeaturesManager a;
    private Map<String, ?> b;
    private ArrayList<String> c = new ArrayList<String>() { // from class: com.ironsource.sdk.controller.FeaturesManager.1
        {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
        }
    };

    private FeaturesManager() {
        if (a != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.b = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (a == null) {
            synchronized (FeaturesManager.class) {
                if (a == null) {
                    a = new FeaturesManager();
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<String> a() {
        return new ArrayList<>(this.c);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.b.containsKey("debugMode")) {
                num = (Integer) this.b.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.b = map;
    }
}
