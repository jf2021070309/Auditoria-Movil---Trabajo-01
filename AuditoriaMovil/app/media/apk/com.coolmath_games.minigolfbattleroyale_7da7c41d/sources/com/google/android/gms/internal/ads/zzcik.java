package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzcik implements Runnable {
    private final zzcii zza;

    private zzcik(zzcii zzciiVar) {
        this.zza = zzciiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcii zzciiVar) {
        return new zzcik(zzciiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
