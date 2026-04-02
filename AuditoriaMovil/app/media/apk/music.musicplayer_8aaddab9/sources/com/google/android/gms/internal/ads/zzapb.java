package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public class zzapb {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzg(Level.ALL_INT);
    }

    public final boolean zzc() {
        return zzg(4);
    }

    public final boolean zzd() {
        return zzg(1);
    }

    public final void zze(int i2) {
        this.zza = i2;
    }

    public final void zzf(int i2) {
        this.zza |= Level.ALL_INT;
    }

    public final boolean zzg(int i2) {
        return (this.zza & i2) == i2;
    }
}
