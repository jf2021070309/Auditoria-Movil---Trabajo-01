package com.google.android.gms.internal.ads;

import com.vungle.warren.AdLoader;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzafh implements zzahu {
    final /* synthetic */ zzafp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafh(zzafp zzafpVar) {
        this.zza = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zza(long j) {
        if (j >= AdLoader.RETRY_DELAY) {
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
