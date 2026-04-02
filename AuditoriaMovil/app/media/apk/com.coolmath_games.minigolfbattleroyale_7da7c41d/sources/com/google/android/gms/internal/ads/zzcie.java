package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcie implements Runnable {
    final /* synthetic */ zzcig zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcie(zzcig zzcigVar) {
        this.zza = zzcigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcih zzcihVar;
        boolean z;
        zzcih zzcihVar2;
        zzcih zzcihVar3;
        zzcihVar = this.zza.zzs;
        if (zzcihVar != null) {
            z = this.zza.zzt;
            if (!z) {
                zzcihVar3 = this.zza.zzs;
                zzcihVar3.zzk();
                zzcig.zzc(this.zza, true);
            }
            zzcihVar2 = this.zza.zzs;
            zzcihVar2.zzc();
        }
    }
}
