package com.google.android.gms.internal.ads;

import android.view.Surface;
/* loaded from: classes.dex */
public final class zzavv implements Runnable {
    public final /* synthetic */ Surface zza;
    public final /* synthetic */ zzavx zzb;

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
