package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzavt implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzavx zzc;

    public zzavt(zzavx zzavxVar, int i2, long j2) {
        this.zzc = zzavxVar;
        this.zza = i2;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zzc.zzb;
        zzavyVar.zzm(this.zza, this.zzb);
    }
}
