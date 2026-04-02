package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcia implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcig zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcia(zzcig zzcigVar, String str, String str2) {
        this.zzc = zzcigVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcih zzcihVar;
        zzcih zzcihVar2;
        zzcihVar = this.zzc.zzs;
        if (zzcihVar != null) {
            zzcihVar2 = this.zzc.zzs;
            zzcihVar2.zzf(this.zza, this.zzb);
        }
    }
}
