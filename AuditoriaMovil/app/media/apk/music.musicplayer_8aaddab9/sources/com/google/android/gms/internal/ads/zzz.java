package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public class zzz {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzh(Level.ALL_INT);
    }

    public final boolean zzc() {
        return zzh(4);
    }

    public final boolean zzd() {
        return zzh(1);
    }

    public final boolean zze() {
        return zzh(268435456);
    }

    public final void zzf(int i2) {
        this.zza = i2;
    }

    public final void zzg(int i2) {
        this.zza |= Level.ALL_INT;
    }

    public final boolean zzh(int i2) {
        return (this.zza & i2) == i2;
    }
}
