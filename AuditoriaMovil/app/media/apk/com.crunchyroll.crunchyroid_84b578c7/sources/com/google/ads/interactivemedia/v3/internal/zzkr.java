package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzkr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzkt zzb;

    public zzkr(zzkt zzktVar, int i, boolean z) {
        this.zzb = zzktVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbc zzbcVar;
        zzkt zzktVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzktVar.zza.getPackageManager().getPackageInfo(zzktVar.zza.getPackageName(), 0);
            Context context = zzktVar.zza;
            zzbcVar = zzpg.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzbcVar = null;
        }
        this.zzb.zzm = zzbcVar;
        if (this.zza < 4) {
            if (zzbcVar == null || !zzbcVar.zzaj() || zzbcVar.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzbcVar.zzak() || !zzbcVar.zze().zzd() || zzbcVar.zze().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
