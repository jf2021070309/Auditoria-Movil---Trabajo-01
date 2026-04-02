package com.kwad.sdk.m;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
/* loaded from: classes3.dex */
public final class g extends ContextThemeWrapper {
    private final Context aMG;
    private final e aMP;
    private f aMQ;
    private LayoutInflater mInflater;

    public g(Context context, e eVar) {
        super(context, l.ds(context));
        this.aMG = context;
        this.aMP = eVar;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        return l.wrapContextIfNeed(super.createConfigurationContext(configuration));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        f fVar = this.aMQ;
        if (fVar != null) {
            return fVar;
        }
        Context context = this.aMG;
        if (!(context instanceof f)) {
            boolean z = context instanceof Application;
            context = l.wrapContextIfNeed(context);
            if (!z) {
                return context;
            }
        }
        f fVar2 = (f) context;
        this.aMQ = fVar2;
        return fVar2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return super.getApplicationInfo();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.aMP.getResources().getAssets();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.aMP.getClassLoader();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.aMP.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = l.b(this.aMG, this);
            }
            return this.mInflater;
        }
        return this.aMG.getSystemService(str);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.aMG.registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.aMG.unregisterComponentCallbacks(componentCallbacks);
    }
}
