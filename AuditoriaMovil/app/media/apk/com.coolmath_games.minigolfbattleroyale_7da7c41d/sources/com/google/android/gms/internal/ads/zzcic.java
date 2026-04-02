package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcic implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcig zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcic(zzcig zzcigVar, int i, int i2) {
        this.zzc = zzcigVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcih zzcihVar;
        zzcih zzcihVar2;
        zzcihVar = this.zzc.zzs;
        if (zzcihVar != null) {
            zzcihVar2 = this.zzc.zzs;
            zzcihVar2.zzj(this.zza, this.zzb);
        }
    }
}
