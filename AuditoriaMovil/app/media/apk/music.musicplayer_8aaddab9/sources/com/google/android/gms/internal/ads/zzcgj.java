package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcgj extends Thread {
    public final /* synthetic */ String zza;

    public zzcgj(zzcgk zzcgkVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzcgy(null).zza(this.zza);
    }
}
