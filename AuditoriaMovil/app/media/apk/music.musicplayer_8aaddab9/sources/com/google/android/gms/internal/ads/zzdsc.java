package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzdsc implements zzgla<zzeec<zzdrw>> {
    private final zzgln<zzejc<zzdrw, zzfbi, zzefz>> zza;
    private final zzgln<zzejc<zzdrw, zzfbi, zzefy>> zzb;
    private final zzgln<zzfar> zzc;

    public zzdsc(zzgln<zzejc<zzdrw, zzfbi, zzefz>> zzglnVar, zzgln<zzejc<zzdrw, zzfbi, zzefy>> zzglnVar2, zzgln<zzfar> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgln<zzejc<zzdrw, zzfbi, zzefz>> zzglnVar = this.zza;
        zzgln<zzejc<zzdrw, zzfbi, zzefy>> zzglnVar2 = this.zzb;
        int i2 = ((zzdat) this.zzc).zza().zzo.zza;
        int i3 = i2 - 1;
        if (i2 != 0) {
            return i3 != 0 ? ((zzejd) zzglnVar2).zzb() : ((zzejd) zzglnVar).zzb();
        }
        throw null;
    }
}
