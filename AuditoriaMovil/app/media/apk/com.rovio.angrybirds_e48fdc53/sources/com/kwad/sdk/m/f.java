package com.kwad.sdk.m;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
/* loaded from: classes3.dex */
public final class f extends Application implements a {
    private final Application aMN;
    private final g aMO;

    public f(Application application, g gVar) {
        this.aMN = application;
        this.aMO = gVar;
        attachBaseContext(gVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.aMO.getApplicationContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.aMO.getClassLoader();
    }

    @Override // com.kwad.sdk.m.a
    public final Context getDelegatedContext() {
        return this.aMN;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.aMO.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
