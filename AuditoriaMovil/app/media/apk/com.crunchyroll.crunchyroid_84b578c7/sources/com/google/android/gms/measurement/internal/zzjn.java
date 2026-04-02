package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.amazon.aps.iva.m80.a;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    public zzjn(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}
