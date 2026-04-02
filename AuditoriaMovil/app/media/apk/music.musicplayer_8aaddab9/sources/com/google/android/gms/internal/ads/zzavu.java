package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzavu implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ float zzd;
    public final /* synthetic */ zzavx zze;

    public zzavu(zzavx zzavxVar, int i2, int i3, int i4, float f2) {
        this.zze = zzavxVar;
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zze.zzb;
        zzavyVar.zzn(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
