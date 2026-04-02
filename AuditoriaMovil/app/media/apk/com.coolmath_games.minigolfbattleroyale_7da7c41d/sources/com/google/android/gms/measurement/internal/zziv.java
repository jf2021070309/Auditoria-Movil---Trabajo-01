package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zziv implements Runnable {
    final /* synthetic */ zzas zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zzjk zzjkVar, zzas zzasVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjkVar;
        this.zza = zzasVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfu zzfuVar;
        zzed zzedVar;
        byte[] bArr = null;
        try {
            try {
                zzedVar = this.zzd.zzb;
                if (zzedVar == null) {
                    this.zzd.zzs.zzau().zzb().zza("Discarding data. Failed to send event to service to bundle");
                    zzfuVar = this.zzd.zzs;
                } else {
                    bArr = zzedVar.zzj(this.zza, this.zzb);
                    this.zzd.zzP();
                    zzfuVar = this.zzd.zzs;
                }
            } catch (RemoteException e) {
                this.zzd.zzs.zzau().zzb().zzb("Failed to send event to the service to bundle", e);
                zzfuVar = this.zzd.zzs;
            }
            zzfuVar.zzl().zzag(this.zzc, bArr);
        } catch (Throwable th) {
            this.zzd.zzs.zzl().zzag(this.zzc, bArr);
            throw th;
        }
    }
}
