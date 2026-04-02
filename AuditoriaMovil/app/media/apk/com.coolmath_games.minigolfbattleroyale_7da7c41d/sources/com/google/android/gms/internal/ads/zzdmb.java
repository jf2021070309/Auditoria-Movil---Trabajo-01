package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzdmb implements Runnable {
    private final zzdmu zza;

    private zzdmb(zzdmu zzdmuVar) {
        this.zza = zzdmuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdmu zzdmuVar) {
        return new zzdmb(zzdmuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
