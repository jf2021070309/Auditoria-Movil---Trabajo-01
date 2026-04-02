package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzewg implements Runnable {
    private final zzeli zza;

    private zzewg(zzeli zzeliVar) {
        this.zza = zzeliVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzeli zzeliVar) {
        return new zzewg(zzeliVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
