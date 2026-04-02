package com.google.android.gms.internal.consent_sdk;

import e.d.b.f.d;
/* loaded from: classes.dex */
public final /* synthetic */ class zzu implements Runnable {
    private final d zza;

    private zzu(d dVar) {
        this.zza = dVar;
    }

    public static Runnable zza(d dVar) {
        return new zzu(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.a();
    }
}
