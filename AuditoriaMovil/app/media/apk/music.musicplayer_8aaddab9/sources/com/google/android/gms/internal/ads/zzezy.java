package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzezy {
    private final Clock zza;
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzezy(Clock clock) {
        this.zza = clock;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzb) {
            if (this.zzd == 3) {
                if (this.zzc + ((Long) zzbet.zzc().zzc(zzbjl.zzel)).longValue() <= currentTimeMillis) {
                    this.zzd = 1;
                }
            }
        }
    }

    private final void zzf(int i2, int i3) {
        zze();
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzb) {
            if (this.zzd != i2) {
                return;
            }
            this.zzd = i3;
            if (this.zzd == 3) {
                this.zzc = currentTimeMillis;
            }
        }
    }

    public final void zza(boolean z) {
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z;
        synchronized (this.zzb) {
            zze();
            z = this.zzd == 2;
        }
        return z;
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzb) {
            zze();
            z = this.zzd == 3;
        }
        return z;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
