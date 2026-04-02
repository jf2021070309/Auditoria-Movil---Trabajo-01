package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcin implements Runnable {
    public final /* synthetic */ zzcip zza;

    public zzcin(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
