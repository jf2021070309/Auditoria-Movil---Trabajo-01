package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeih implements Runnable {
    private final zzdsw zza;

    private zzeih(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdsw zzdswVar) {
        return new zzeih(zzdswVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
