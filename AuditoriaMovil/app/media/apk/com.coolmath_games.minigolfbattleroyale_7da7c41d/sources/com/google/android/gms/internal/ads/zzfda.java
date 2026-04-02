package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
