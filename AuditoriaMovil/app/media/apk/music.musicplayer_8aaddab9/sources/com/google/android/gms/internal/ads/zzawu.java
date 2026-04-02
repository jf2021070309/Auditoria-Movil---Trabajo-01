package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes.dex */
public final class zzawu implements Runnable {
    public final /* synthetic */ zzawv zza;

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
                    zzcgt.zzd("App went background");
                    list = this.zza.zzf;
                    for (zzaww zzawwVar : list) {
                        try {
                            zzawwVar.zza(false);
                        } catch (Exception e2) {
                            zzcgt.zzg("", e2);
                        }
                    }
                }
            }
            zzcgt.zzd("App is still foreground");
        }
    }
}
