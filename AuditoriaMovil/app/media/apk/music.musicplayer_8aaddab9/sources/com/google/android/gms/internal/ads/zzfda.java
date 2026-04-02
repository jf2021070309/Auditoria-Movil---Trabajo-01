package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzfda {
    private final long zza;
    private long zzc;
    private final zzfcz zzb = new zzfcz();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfda() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzfcz zzg() {
        zzfcz clone = this.zzb.clone();
        zzfcz zzfczVar = this.zzb;
        zzfczVar.zza = false;
        zzfczVar.zzb = 0;
        return clone;
    }

    public final String zzh() {
        StringBuilder y = a.y("Created: ");
        y.append(this.zza);
        y.append(" Last accessed: ");
        y.append(this.zzc);
        y.append(" Accesses: ");
        y.append(this.zzd);
        y.append("\nEntries retrieved: Valid: ");
        y.append(this.zze);
        y.append(" Stale: ");
        y.append(this.zzf);
        return y.toString();
    }
}
