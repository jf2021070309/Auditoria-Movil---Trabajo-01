package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaqp implements zzaqm {
    private final zzaux zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaqp(zzaqj zzaqjVar) {
        zzaux zzauxVar = zzaqjVar.zza;
        this.zza = zzauxVar;
        zzauxVar.zzi(12);
        this.zzc = zzauxVar.zzu() & 255;
        this.zzb = zzauxVar.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zzb() {
        int i2 = this.zzc;
        if (i2 == 8) {
            return this.zza.zzl();
        }
        if (i2 == 16) {
            return this.zza.zzm();
        }
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        if (i3 % 2 == 0) {
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
