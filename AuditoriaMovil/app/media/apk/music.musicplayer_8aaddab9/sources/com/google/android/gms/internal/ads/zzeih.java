package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzeih implements Runnable {
    private final zzdsw zza;

    private zzeih(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    public static Runnable zza(zzdsw zzdswVar) {
        return new zzeih(zzdswVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
