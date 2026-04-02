package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzcmz implements Runnable {
    private final zzcml zza;

    private zzcmz(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    public static Runnable zza(zzcml zzcmlVar) {
        return new zzcmz(zzcmlVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
