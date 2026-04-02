package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcim implements Runnable {
    public final /* synthetic */ zzcip zza;

    public zzcim(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
