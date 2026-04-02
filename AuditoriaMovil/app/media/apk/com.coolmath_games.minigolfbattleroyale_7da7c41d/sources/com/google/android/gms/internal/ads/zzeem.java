package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeem implements Runnable {
    private final zzdsw zza;

    private zzeem(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdsw zzdswVar) {
        return new zzeem(zzdswVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
