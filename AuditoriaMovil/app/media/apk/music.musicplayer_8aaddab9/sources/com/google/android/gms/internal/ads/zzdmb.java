package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdmb implements Runnable {
    private final zzdmu zza;

    private zzdmb(zzdmu zzdmuVar) {
        this.zza = zzdmuVar;
    }

    public static Runnable zza(zzdmu zzdmuVar) {
        return new zzdmb(zzdmuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
