package com.kwad.library.b.c;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.ContextThemeWrapper;
import com.kwad.sdk.utils.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends ContextThemeWrapper implements b {
    private String afA;
    private final ContextThemeWrapper afB;
    private Resources.Theme afy;
    private int afz;

    public d(ContextThemeWrapper contextThemeWrapper, String str) {
        super(contextThemeWrapper, contextThemeWrapper.getThemeResId());
        this.afB = contextThemeWrapper;
        this.afA = str;
        try {
            Object f = s.f(contextThemeWrapper, "getThemeResId", new Object[0]);
            if (f != null) {
                this.afz = ((Integer) f).intValue();
            }
        } catch (Throwable th) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return a.g(this.afB.getApplicationContext(), this.afA);
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return this.afB;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return a.a(super.getClassLoader(), this.afA);
    }

    @Override // com.kwad.library.b.c.b
    public final Context getDelegatedContext() {
        return this.afB;
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return a.a(this.afB.getResources(), this.afA);
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return a.wrapSystemService(this.afB.getSystemService(str), str, this);
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
            this.afy = a.a(theme, theme2, this.afz, this.afA);
        }
        return this.afy;
    }

    @Override // android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.afB.registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.support.v7.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        this.afz = i;
        super.setTheme(i);
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.afB.unregisterComponentCallbacks(componentCallbacks);
    }
}
