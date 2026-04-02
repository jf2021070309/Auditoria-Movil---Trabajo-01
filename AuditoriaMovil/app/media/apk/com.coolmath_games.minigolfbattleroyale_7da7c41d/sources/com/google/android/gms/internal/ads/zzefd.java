package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefd implements zzeec<zzcvh> {
    private final zzcwe zza;
    private final Context zzb;
    private final zzdss zzc;
    private final zzfar zzd;
    private final Executor zze;
    private final zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav> zzf;

    public zzefd(zzcwe zzcweVar, Context context, Executor executor, zzdss zzdssVar, zzfar zzfarVar, zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav> zzflnVar) {
        this.zzb = context;
        this.zza = zzcweVar;
        this.zze = executor;
        this.zzc = zzdssVar;
        this.zzd = zzfarVar;
        this.zzf = zzflnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        zzfae zzfaeVar = zzezzVar.zzs;
        return (zzfaeVar == null || zzfaeVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<zzcvh> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        return zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zzfalVar, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzeex
            private final zzefd zza;
            private final zzfal zzb;
            private final zzezz zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzd(this.zzb, this.zzc, obj);
            }
        }, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcml zzcmlVar) {
        zzcmlVar.zzL();
        zzcnh zzh = zzcmlVar.zzh();
        zzbis zzbisVar = this.zzd.zza;
        if (zzbisVar == null || zzh == null) {
            return;
        }
        zzh.zzc(zzbisVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzd(zzfal zzfalVar, zzezz zzezzVar, Object obj) throws Exception {
        View zzdsvVar;
        zzbdl zzb = zzfav.zzb(this.zzb, zzezzVar.zzu);
        final zzcml zzb2 = this.zzc.zzb(zzb, zzezzVar, zzfalVar.zzb.zzb);
        zzb2.zzav(zzezzVar.zzS);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() || !zzezzVar.zzad) {
            zzdsvVar = new zzdsv(this.zzb, (View) zzb2, this.zzf.apply(zzezzVar));
        } else {
            zzdsvVar = zzcwv.zza(this.zzb, (View) zzb2, zzezzVar);
        }
        final zzcvi zzaa = this.zza.zzaa(new zzcxv(zzfalVar, zzezzVar, null), new zzcvo(zzdsvVar, zzb2, zzeey.zzb(zzb2), zzfav.zzc(zzb)));
        zzaa.zzi().zzi(zzb2, false, null);
        zzaa.zzd().zzi(new zzdbw(zzb2) { // from class: com.google.android.gms.internal.ads.zzeez
            private final zzcml zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzdbw
            public final void zzg() {
                zzcml zzcmlVar = this.zza;
                if (zzcmlVar.zzR() != null) {
                    zzcmlVar.zzR().zzj();
                }
            }
        }, zzchg.zzf);
        zzaa.zzi();
        zzfae zzfaeVar = zzezzVar.zzs;
        zzfsm<?> zzj = zzdsr.zzj(zzb2, zzfaeVar.zzb, zzfaeVar.zza);
        if (zzezzVar.zzI) {
            zzj.zze(zzefa.zza(zzb2), this.zze);
        }
        zzj.zze(new Runnable(this, zzb2) { // from class: com.google.android.gms.internal.ads.zzefb
            private final zzefd zza;
            private final zzcml zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb);
            }
        }, this.zze);
        return zzfsd.zzj(zzj, new zzfln(zzaa) { // from class: com.google.android.gms.internal.ads.zzefc
            private final zzcvi zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzaa;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj2) {
                return this.zza.zzh();
            }
        }, zzchg.zzf);
    }
}
