package com.google.android.gms.internal.ads;

import android.view.Surface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzavv implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzavx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavv(zzavx zzavxVar, Surface surface) {
        this.zzb = zzavxVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zzb.zzb;
        zzavyVar.zzo(this.zza);
    }
}
