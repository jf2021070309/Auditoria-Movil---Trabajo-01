package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaqp implements zzaqm {
    private final zzaux zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaqp(zzaqj zzaqjVar) {
        zzaux zzauxVar = zzaqjVar.zza;
        this.zza = zzauxVar;
        zzauxVar.zzi(12);
        this.zzc = this.zza.zzu() & 255;
        this.zzb = this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zzb() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzl();
        }
        if (i == 16) {
            return this.zza.zzm();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzl = this.zza.zzl();
            this.zze = zzl;
            return (zzl & 240) >> 4;
        }
        return this.zze & 15;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final boolean zzc() {
        return false;
    }
}
