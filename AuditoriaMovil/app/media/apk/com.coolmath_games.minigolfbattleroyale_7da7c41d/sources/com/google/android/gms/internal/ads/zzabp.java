package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabp implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzabr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabp(zzabr zzabrVar, int i, boolean z) {
        this.zzb = zzabrVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyz zzyzVar;
        zzabr zzabrVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzabrVar.zza.getPackageManager().getPackageInfo(zzabrVar.zza.getPackageName(), 0);
            Context context = zzabrVar.zza;
            zzyzVar = zzfiq.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzyzVar = null;
        }
        this.zzb.zzm = zzyzVar;
        if (this.zza < 4) {
            if (zzyzVar != null && zzyzVar.zza() && !zzyzVar.zzc().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzyzVar.zzf() && zzyzVar.zzg().zza() && zzyzVar.zzg().zzc() != -2) {
                return;
            }
            this.zzb.zzs(this.zza + 1, true);
        }
    }
}
