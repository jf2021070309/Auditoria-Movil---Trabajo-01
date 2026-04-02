package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcic implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzcig zzc;

    public zzcic(zzcig zzcigVar, int i2, int i3) {
        this.zzc = zzcigVar;
        this.zza = i2;
        this.zzb = i3;
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
