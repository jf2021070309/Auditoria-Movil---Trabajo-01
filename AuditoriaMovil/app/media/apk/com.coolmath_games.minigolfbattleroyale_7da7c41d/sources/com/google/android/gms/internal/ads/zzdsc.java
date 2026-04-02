package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        int i = ((zzdat) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                return ((zzejd) zzglnVar2).zzb();
            }
            return ((zzejd) zzglnVar).zzb();
        }
        throw null;
    }
}
