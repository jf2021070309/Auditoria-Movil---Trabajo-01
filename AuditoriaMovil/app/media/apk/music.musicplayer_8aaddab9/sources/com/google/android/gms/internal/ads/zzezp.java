package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzezp implements zzelx<zzdrw> {
    public final /* synthetic */ zzezq zza;

    public zzezp(zzezq zzezqVar) {
        this.zza = zzezqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzdrw zzdrwVar) {
        zzdrw zzdrwVar2;
        zzdrw zzdrwVar3 = zzdrwVar;
        synchronized (this.zza) {
            this.zza.zzf = zzdrwVar3;
            zzdrwVar2 = this.zza.zzf;
            zzdrwVar2.zzS();
        }
    }
}
