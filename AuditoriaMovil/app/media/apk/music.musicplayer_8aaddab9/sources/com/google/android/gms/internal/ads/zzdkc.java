package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzdkc implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzddi zza;
    private final zzdif zzb;

    public zzdkc(zzddi zzddiVar, zzdif zzdifVar) {
        this.zza = zzddiVar;
        this.zzb = zzdifVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        this.zza.zzbp();
        this.zzb.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
        this.zza.zzbq();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        this.zza.zzbr();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i2) {
        this.zza.zzbs(i2);
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        this.zza.zze();
    }
}
