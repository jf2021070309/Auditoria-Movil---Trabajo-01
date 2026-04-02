package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaqo implements zzaqm {
    private final int zza;
    private final int zzb;
    private final zzaux zzc;

    public zzaqo(zzaqj zzaqjVar) {
        zzaux zzauxVar = zzaqjVar.zza;
        this.zzc = zzauxVar;
        zzauxVar.zzi(12);
        this.zza = this.zzc.zzu();
        this.zzb = this.zzc.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final int zzb() {
        int i = this.zza;
        return i == 0 ? this.zzc.zzu() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final boolean zzc() {
        return this.zza != 0;
    }
}
