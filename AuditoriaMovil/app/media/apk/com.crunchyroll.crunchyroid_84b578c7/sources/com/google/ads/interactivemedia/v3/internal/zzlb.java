package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager$OnOpActiveChangedListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzlb implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzlc zza;

    public zzlb(zzlc zzlcVar) {
        this.zza = zzlcVar;
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
        zzlc zzlcVar = this.zza;
        j = zzlcVar.zzc;
        if (j > 0) {
            j2 = zzlcVar.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzlcVar.zzc;
                zzlcVar.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
