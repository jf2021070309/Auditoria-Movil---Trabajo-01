package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcxt implements zzfrz<zzcxg> {
    final /* synthetic */ zzfrz zza;
    final /* synthetic */ zzcxu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxt(zzcxu zzcxuVar, zzfrz zzfrzVar) {
        this.zzb = zzcxuVar;
        this.zza = zzfrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzchg.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcxr
            private final zzcxu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcxg zzcxgVar) {
        zzchg.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcxr
            private final zzcxu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zza.zzb(zzcxgVar);
    }
}
