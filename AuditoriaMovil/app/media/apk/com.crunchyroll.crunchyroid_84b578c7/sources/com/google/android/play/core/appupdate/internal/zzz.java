package com.google.android.play.core.appupdate.internal;

import android.content.Context;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes3.dex */
public final class zzz {
    public static Context zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
