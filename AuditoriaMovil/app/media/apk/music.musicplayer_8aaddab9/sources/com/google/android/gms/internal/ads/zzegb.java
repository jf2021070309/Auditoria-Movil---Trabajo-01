package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzegb implements Runnable {
    private final zzdsw zza;

    private zzegb(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    public static Runnable zza(zzdsw zzdswVar) {
        return new zzegb(zzdswVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
