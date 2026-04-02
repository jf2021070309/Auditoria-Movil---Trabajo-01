package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzhi implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzia zzb;

    public zzhi(zzia zziaVar, long j2) {
        this.zzb = zziaVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference<>());
    }
}
