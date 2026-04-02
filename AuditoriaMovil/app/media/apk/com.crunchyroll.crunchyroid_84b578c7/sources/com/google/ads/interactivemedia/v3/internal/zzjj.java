package com.google.ads.interactivemedia.v3.internal;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzjj implements Runnable {
    final /* synthetic */ zzjk zza;

    public zzjj(zzjk zzjkVar) {
        this.zza = zzjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzkt zzktVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb == null) {
            conditionVariable = zzjk.zzc;
            synchronized (conditionVariable) {
                if (this.zza.zzb != null) {
                    return;
                }
                boolean z2 = false;
                try {
                    z = ((Boolean) zznr.zzch.zzb()).booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        zzktVar = this.zza.zze;
                        zzjk.zza = zzqo.zzb(zzktVar.zza, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.zza.zzb = Boolean.valueOf(z2);
                conditionVariable2 = zzjk.zzc;
                conditionVariable2.open();
            }
        }
    }
}
