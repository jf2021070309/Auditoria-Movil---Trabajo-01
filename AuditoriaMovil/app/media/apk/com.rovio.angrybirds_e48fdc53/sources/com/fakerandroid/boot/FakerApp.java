package com.fakerandroid.boot;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDexApplication;
/* loaded from: classes2.dex */
public class FakerApp extends MultiDexApplication {
    private native void fakeApp(Application application);

    private native void fakeDex(Context context);

    @Override // android.support.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        fakeDex(base);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        fakeApp(this);
    }
}
