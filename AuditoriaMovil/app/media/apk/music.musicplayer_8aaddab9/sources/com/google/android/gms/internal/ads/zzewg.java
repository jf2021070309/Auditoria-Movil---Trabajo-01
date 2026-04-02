package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzewg implements Runnable {
    private final zzeli zza;

    private zzewg(zzeli zzeliVar) {
        this.zza = zzeliVar;
    }

    public static Runnable zza(zzeli zzeliVar) {
        return new zzewg(zzeliVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
