package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
/* loaded from: classes.dex */
public final class zzaam implements Runnable {
    public final /* synthetic */ zzaan zza;

    public zzaam(zzaan zzaanVar) {
        this.zza = zzaanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzabr zzabrVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzaan.zzd;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = zzbjl.zzbF.zze().booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzabrVar = this.zza.zzc;
                    zzaan.zza = new zzfkk(zzabrVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzaan.zzd;
            conditionVariable2.open();
        }
    }
}
