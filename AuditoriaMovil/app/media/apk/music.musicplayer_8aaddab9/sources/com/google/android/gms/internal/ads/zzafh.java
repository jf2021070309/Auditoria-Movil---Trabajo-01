package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzafh implements zzahu {
    public final /* synthetic */ zzafp zza;

    public zzafh(zzafp zzafpVar) {
        this.zza = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zza(long j2) {
        if (j2 >= 2000) {
            zzafp.zzd(this.zza, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzb() {
        zzalg zzalgVar;
        zzalgVar = this.zza.zzh;
        zzalgVar.zzf(2);
    }
}
