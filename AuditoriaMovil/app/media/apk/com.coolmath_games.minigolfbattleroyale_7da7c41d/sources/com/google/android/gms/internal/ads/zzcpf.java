package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcpf implements zzgla<zzcbu> {
    private final zzgln<Context> zza;

    public zzcpf(zzgln<Context> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzcbu zzb() {
        Context zza = ((zzcoo) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp().zza(zza, zzcgz.zza()).zza("google.afma.request.getAdDictionary", zzbud.zza, zzbud.zza);
        return new zzcbt(zza, com.google.android.gms.ads.internal.zzt.zzp().zza(zza, zzcgz.zza()).zza("google.afma.sdkConstants.getSdkConstants", zzbud.zza, zzbud.zza));
    }
}
