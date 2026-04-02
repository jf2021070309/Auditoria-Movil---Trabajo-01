package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaqo implements zzaqm {
    private final int zza;
    private final int zzb;
    private final zzaux zzc;

    public zzaqo(zzaqj zzaqjVar) {
        zzaux zzauxVar = zzaqjVar.zza;
        this.zzc = zzauxVar;
        zzauxVar.zzi(12);
        this.zza = zzauxVar.zzu();
        this.zzb = zzauxVar.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zzb() {
        int i2 = this.zza;
        return i2 == 0 ? this.zzc.zzu() : i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final boolean zzc() {
        return this.zza != 0;
    }
}
