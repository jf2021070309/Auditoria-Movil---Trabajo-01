package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtq implements zzchp<zzbsn> {
    final /* synthetic */ zzbtr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtq(zzbtr zzbtrVar) {
        this.zza = zzbtrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbsn zzbsnVar) {
        final zzbsn zzbsnVar2 = zzbsnVar;
        zzchg.zze.execute(new Runnable(this, zzbsnVar2) { // from class: com.google.android.gms.internal.ads.zzbtp
            private final zzbtq zza;
            private final zzbsn zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbsnVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbsn zzbsnVar3 = this.zzb;
                zzbsnVar3.zzm("/result", zzbpq.zzo);
                zzbsnVar3.zzi();
            }
        });
    }
}
