package com.google.android.gms.internal.pal;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzco implements Runnable {
    final /* synthetic */ zzcp zza;

    public zzco(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzdu zzduVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb == null) {
            conditionVariable = zzcp.zzc;
            synchronized (conditionVariable) {
                if (this.zza.zzb != null) {
                    return;
                }
                boolean z2 = false;
                try {
                    z = ((Boolean) zzgk.zzcc.zzb()).booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        zzduVar = this.zza.zze;
                        zzcp.zza = zzhp.zzb(zzduVar.zza, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.zza.zzb = Boolean.valueOf(z2);
                conditionVariable2 = zzcp.zzc;
                conditionVariable2.open();
            }
        }
    }
}
