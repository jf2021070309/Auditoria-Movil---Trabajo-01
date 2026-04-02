package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdzd implements zzgla<PackageInfo> {
    private final zzgln<Context> zza;
    private final zzgln<ApplicationInfo> zzb;

    public zzdzd(zzgln<Context> zzglnVar, zzgln<ApplicationInfo> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager(this.zza.zzb()).getPackageInfo(((zzdyy) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
