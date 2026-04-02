package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzcmz implements Runnable {
    private final zzcml zza;

    private zzcmz(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcml zzcmlVar) {
        return new zzcmz(zzcmlVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
