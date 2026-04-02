package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcid implements Runnable {
    final /* synthetic */ zzcig zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcid(zzcig zzcigVar) {
        this.zza = zzcigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcih zzcihVar;
        zzcih zzcihVar2;
        zzcih zzcihVar3;
        zzcihVar = this.zza.zzs;
        if (zzcihVar != null) {
            zzcihVar2 = this.zza.zzs;
            zzcihVar2.zzd();
            zzcihVar3 = this.zza.zzs;
            zzcihVar3.zzh();
        }
    }
}
