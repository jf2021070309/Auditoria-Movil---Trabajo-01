package com.kwad.sdk.m;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c extends ContextThemeWrapper implements a {
    private final ContextThemeWrapper aMF;
    private Resources.Theme afy;
    private int afz;
    private LayoutInflater mInflater;

    public c(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, contextThemeWrapper.getThemeResId());
        this.aMF = contextThemeWrapper;
        this.afz = l.ds(contextThemeWrapper);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return i.wrapContextIfNeed(this.aMF.getApplicationContext());
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return i.replaceExternalClassLoader(super.getClassLoader());
    }

    @Override // com.kwad.sdk.m.a
    public final Context getDelegatedContext() {
        return this.aMF;
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return e.KM().getResources();
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = l.b(this.aMF, this);
            }
            return this.mInflater;
        }
        return this.aMF.getSystemService(str);
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme;
        try {
            theme = super.getTheme();
        } catch (Exception e) {
            e.printStackTrace();
            theme = null;
        }
        Resources.Theme theme2 = this.afy;
        if (theme2 == null || theme2 == theme) {
            this.afy = i.replaceTheme(theme, theme2, this.afz);
        }
        return this.afy;
    }

    @Override // android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.aMF.registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        this.afz = i;
        super.setTheme(i);
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.aMF.unregisterComponentCallbacks(componentCallbacks);
    }
}
