package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdyy implements zzgla<ApplicationInfo> {
    private final zzgln<Context> zza;

    public zzdyy(zzgln<Context> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = this.zza.zzb().getApplicationInfo();
        zzgli.zzb(applicationInfo);
        return applicationInfo;
    }
}
