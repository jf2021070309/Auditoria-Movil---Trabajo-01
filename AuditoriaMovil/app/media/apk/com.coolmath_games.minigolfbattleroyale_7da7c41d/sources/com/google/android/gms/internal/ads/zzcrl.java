package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcrl implements zzgla<zzcgy> {
    private final zzgln<zzbut> zza;
    private final zzgln<String> zzb;

    public zzcrl(zzgln<zzbut> zzglnVar, zzgln<String> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbuv zzbuvVar = new zzbuv();
        String zzb = this.zzb.zzb();
        if (zzbkz.zza.zze().booleanValue()) {
            return new zzbuu(zzbuvVar, zzb);
        }
        return new zzcgy(zzb);
    }
}
