package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdze implements zzgla<String> {
    private final zzgln<Context> zza;

    public zzdze(zzgln<Context> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzfbv) this.zza).zza().getPackageName();
        zzgli.zzb(packageName);
        return packageName;
    }
}
