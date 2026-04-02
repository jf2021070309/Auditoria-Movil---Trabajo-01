package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzezu implements zzelx<zzdrw> {
    final /* synthetic */ zzezw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezu(zzezw zzezwVar) {
        this.zza = zzezwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzdrw zzdrwVar) {
        zzdrw zzdrwVar2;
        zzdrw zzdrwVar3 = zzdrwVar;
        synchronized (this.zza) {
            this.zza.zzd = zzdrwVar3;
            zzdrwVar2 = this.zza.zzd;
            zzdrwVar2.zzS();
        }
    }
}
