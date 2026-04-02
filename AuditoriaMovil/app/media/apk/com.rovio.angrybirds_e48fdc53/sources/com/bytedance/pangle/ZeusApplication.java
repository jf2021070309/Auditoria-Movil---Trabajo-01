package com.bytedance.pangle;

import android.app.Application;
import android.content.Context;
import com.bytedance.pangle.plugin.Plugin;
/* loaded from: classes.dex */
public class ZeusApplication extends PluginContext {
    Application mHostApplication;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void attach(Plugin plugin, Application application) {
        this.mPlugin = plugin;
        this.mHostApplication = application;
        attachBaseContext(application);
        onCreate();
    }

    public void onCreate() {
    }
}
