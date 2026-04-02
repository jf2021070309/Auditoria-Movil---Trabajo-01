package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzels implements zzelx<zzcxg> {
    final /* synthetic */ zzelt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzels(zzelt zzeltVar) {
        this.zza = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzcxg zzcxgVar) {
        synchronized (this.zza) {
            this.zza.zzc = zzcxgVar.zzm();
            zzcxgVar.zzS();
        }
    }
}
