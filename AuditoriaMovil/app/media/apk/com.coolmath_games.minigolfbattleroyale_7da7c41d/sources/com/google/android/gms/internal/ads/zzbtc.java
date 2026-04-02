package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbtc implements Runnable {
    private final zzbsn zza;

    private zzbtc(zzbsn zzbsnVar) {
        this.zza = zzbsnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbsn zzbsnVar) {
        return new zzbtc(zzbsnVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi();
    }
}
