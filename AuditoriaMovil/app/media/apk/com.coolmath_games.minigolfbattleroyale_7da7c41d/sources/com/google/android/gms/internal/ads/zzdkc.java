package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    public final void zzbs(int i) {
        this.zza.zzbs(i);
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
