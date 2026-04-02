package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzavu implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzavx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavu(zzavx zzavxVar, int i, int i2, int i3, float f) {
        this.zze = zzavxVar;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zze.zzb;
        zzavyVar.zzn(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
