package com.google.android.gms.ads.internal.util;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcc {
    private long zza;
    @GuardedBy("lock")
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzcc(long j2) {
        this.zza = j2;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            if (this.zzb + this.zza > elapsedRealtime) {
                return false;
            }
            this.zzb = elapsedRealtime;
            return true;
        }
    }

    public final void zzb(long j2) {
        synchronized (this.zzc) {
            this.zza = j2;
        }
    }
}
