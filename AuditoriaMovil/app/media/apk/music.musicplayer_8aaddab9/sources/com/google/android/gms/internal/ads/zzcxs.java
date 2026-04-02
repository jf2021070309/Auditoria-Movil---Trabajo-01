package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcxs implements zzfrz<zzcxn> {
    public final /* synthetic */ zzfrz zza;
    public final /* synthetic */ zzcxu zzb;

    public zzcxs(zzcxu zzcxuVar, zzfrz zzfrzVar) {
        this.zzb = zzcxuVar;
        this.zza = zzfrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzchg.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcxr
            private final zzcxu zza;

            {
                this.zza = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcxn zzcxnVar) {
        zzcxu.zzb(this.zzb, zzcxnVar.zza, this.zza);
    }
}
