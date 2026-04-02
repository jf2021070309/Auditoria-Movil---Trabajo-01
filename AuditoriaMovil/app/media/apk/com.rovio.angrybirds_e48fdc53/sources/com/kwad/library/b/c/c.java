package com.kwad.library.b.c;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwad.sdk.utils.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends ContextThemeWrapper implements b {
    private String afA;
    private final ContextThemeWrapper afx;
    private Resources.Theme afy;
    private int afz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ContextThemeWrapper contextThemeWrapper, String str) {
        super(contextThemeWrapper, 0);
        this.afx = contextThemeWrapper;
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
        return a.g(this.afx.getApplicationContext(), this.afA);
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return this.afx;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return a.a(super.getClassLoader(), this.afA);
    }

    @Override // com.kwad.library.b.c.b
    public final Context getDelegatedContext() {
        return this.afx;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return a.a(this.afx.getResources(), this.afA);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return a.wrapSystemService(this.afx.getSystemService(str), str, this);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
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
        this.afx.registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        this.afz = i;
        super.setTheme(i);
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.afx.unregisterComponentCallbacks(componentCallbacks);
    }
}
