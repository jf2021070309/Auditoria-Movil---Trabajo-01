package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzds implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzdu zzb;

    public zzds(zzdu zzduVar, int i, boolean z) {
        this.zzb = zzduVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaf zzafVar;
        zzdu zzduVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzduVar.zza.getPackageManager().getPackageInfo(zzduVar.zza.getPackageName(), 0);
            Context context = zzduVar.zza;
            zzafVar = zzhf.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzafVar = null;
        }
        this.zzb.zzm = zzafVar;
        if (this.zza < 4) {
            if (zzafVar == null || !zzafVar.zzah() || zzafVar.zzf().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzafVar.zzai() || !zzafVar.zze().zze() || zzafVar.zze().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
