package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdrv implements Runnable {
    private final zzcml zza;

    private zzdrv(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    public static Runnable zza(zzcml zzcmlVar) {
        return new zzdrv(zzcmlVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
