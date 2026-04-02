package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzelp implements zzelx<zzdji> {
    final /* synthetic */ zzelq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelp(zzelq zzelqVar) {
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzdji zzdjiVar) {
        zzdji zzdjiVar2;
        zzdji zzdjiVar3 = zzdjiVar;
        synchronized (this.zza) {
            this.zza.zzg = zzdjiVar3;
            zzdjiVar2 = this.zza.zzg;
            zzdjiVar2.zzS();
        }
    }
}
