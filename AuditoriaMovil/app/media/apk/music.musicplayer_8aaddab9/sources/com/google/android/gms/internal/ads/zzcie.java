package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcie implements Runnable {
    public final /* synthetic */ zzcig zza;

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
