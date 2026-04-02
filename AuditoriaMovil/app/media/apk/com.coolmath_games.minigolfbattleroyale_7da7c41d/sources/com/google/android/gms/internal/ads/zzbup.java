package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbup {
    private final zzbts zza;
    private zzfsm<zzbtt> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbup(zzbts zzbtsVar) {
        this.zza = zzbtsVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzchl zzchlVar = new zzchl();
            this.zzb = zzchlVar;
            this.zza.zzg(null).zzf(new zzchp(zzchlVar) { // from class: com.google.android.gms.internal.ads.zzbul
                private final zzchl zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzchlVar;
                }

                @Override // com.google.android.gms.internal.ads.zzchp
                public final void zza(Object obj) {
                    this.zza.zzc((zzbtt) obj);
                }
            }, new zzchn(zzchlVar) { // from class: com.google.android.gms.internal.ads.zzbum
                private final zzchl zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzchlVar;
                }

                @Override // com.google.android.gms.internal.ads.zzchn
                public final void zza() {
                    this.zza.zzd(new zzbtv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzbus<I, O> zza(String str, zzbtz<I> zzbtzVar, zzbty<O> zzbtyVar) {
        zzd();
        return new zzbus<>(this.zzb, "google.afma.activeView.handleUpdate", zzbtzVar, zzbtyVar);
    }

    public final void zzb(final String str, final zzbpr<? super zzbtt> zzbprVar) {
        zzd();
        this.zzb = zzfsd.zzi(this.zzb, new zzfrk(str, zzbprVar) { // from class: com.google.android.gms.internal.ads.zzbun
            private final String zza;
            private final zzbpr zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = zzbprVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                zzbtt zzbttVar = (zzbtt) obj;
                zzbttVar.zzl(this.zza, this.zzb);
                return zzfsd.zza(zzbttVar);
            }
        }, zzchg.zzf);
    }

    public final void zzc(final String str, final zzbpr<? super zzbtt> zzbprVar) {
        this.zzb = zzfsd.zzj(this.zzb, new zzfln(str, zzbprVar) { // from class: com.google.android.gms.internal.ads.zzbuo
            private final String zza;
            private final zzbpr zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = zzbprVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                zzbtt zzbttVar = (zzbtt) obj;
                zzbttVar.zzm(this.zza, this.zzb);
                return zzbttVar;
            }
        }, zzchg.zzf);
    }
}
