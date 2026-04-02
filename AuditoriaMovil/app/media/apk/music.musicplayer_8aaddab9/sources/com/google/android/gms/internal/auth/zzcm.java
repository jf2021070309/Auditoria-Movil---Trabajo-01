package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes.dex */
public final class zzcm extends ContentObserver {
    public zzcm(zzcn zzcnVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzcz.zzd();
    }
}
