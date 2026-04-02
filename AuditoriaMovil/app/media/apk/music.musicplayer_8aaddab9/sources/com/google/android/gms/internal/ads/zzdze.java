package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
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
