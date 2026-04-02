package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
/* loaded from: classes.dex */
public final class zzabp implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ zzabr zzb;

    public zzabp(zzabr zzabrVar, int i2, boolean z) {
        this.zzb = zzabrVar;
        this.zza = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyz zzyzVar;
        zzabr zzabrVar = this.zzb;
        int i2 = this.zza;
        if (i2 > 0) {
            try {
                Thread.sleep(i2 * 1000);
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
