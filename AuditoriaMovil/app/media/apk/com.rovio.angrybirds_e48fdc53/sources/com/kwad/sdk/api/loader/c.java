package com.kwad.sdk.api.loader;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    static class a extends Application {
        private final Context air;

        a(Context context) {
            this.air = context;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context getApplicationContext() {
            return this.air;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ApplicationInfo getApplicationInfo() {
            return this.air.getApplicationInfo();
        }
    }

    public static Context ay(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : !applicationContext.getClassLoader().equals(context.getClassLoader()) ? new a(context) : context.getApplicationContext();
    }
}
