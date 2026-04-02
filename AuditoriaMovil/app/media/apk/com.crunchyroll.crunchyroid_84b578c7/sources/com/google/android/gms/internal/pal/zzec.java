package com.google.android.gms.internal.pal;

import android.app.AppOpsManager$OnOpActiveChangedListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzec implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzed zza;

    public zzec(zzed zzedVar) {
        this.zza = zzedVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzed zzedVar = this.zza;
        j = zzedVar.zzc;
        if (j > 0) {
            j2 = zzedVar.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzedVar.zzc;
                zzedVar.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
