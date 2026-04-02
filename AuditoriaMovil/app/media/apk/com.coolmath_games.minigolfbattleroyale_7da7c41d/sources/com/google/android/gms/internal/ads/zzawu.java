package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzawu implements Runnable {
    final /* synthetic */ zzawv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawu(zzawv zzawvVar) {
        this.zza = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzaww> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            z = this.zza.zzd;
            if (z) {
                z2 = this.zza.zze;
                if (z2) {
                    zzawv.zzc(this.zza, false);
                    com.google.android.gms.ads.internal.util.zze.zzd("App went background");
                    list = this.zza.zzf;
                    for (zzaww zzawwVar : list) {
                        try {
                            zzawwVar.zza(false);
                        } catch (Exception e) {
                            zzcgt.zzg("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.zze.zzd("App is still foreground");
        }
    }
}
