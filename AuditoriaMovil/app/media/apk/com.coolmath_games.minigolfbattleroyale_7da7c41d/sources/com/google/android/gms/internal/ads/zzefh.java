package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefh implements zzeek<zzcvh, zzfbi, zzefy> {
    private final Context zza;
    private final zzcwe zzb;
    private final Executor zzc;

    public zzefh(Context context, zzcwe zzcweVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcweVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw {
        zzbdl zzb;
        zzbdl zzbdlVar = zzfalVar.zza.zza.zze;
        if (zzbdlVar.zzn) {
            zzb = new zzbdl(this.zza, com.google.android.gms.ads.zza.zzb(zzbdlVar.zze, zzbdlVar.zzb));
        } else {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() || !zzezzVar.zzad) {
                zzb = zzfav.zzb(this.zza, zzezzVar.zzu);
            } else {
                zzb = new zzbdl(this.zza, com.google.android.gms.ads.zza.zzc(zzbdlVar.zze, zzbdlVar.zzb));
            }
        }
        zzbdl zzbdlVar2 = zzb;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() || !zzezzVar.zzad) {
            zzeefVar.zzb.zzg(this.zza, zzbdlVar2, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), zzeefVar.zzc);
        } else {
            zzeefVar.zzb.zzb(this.zza, zzbdlVar2, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), zzeefVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzcvh zzb(zzfal zzfalVar, final zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw, zzehs {
        final View zza;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() || !zzezzVar.zzad) {
            zza = zzeefVar.zzb.zza();
        } else {
            zzbvp zzc = zzeefVar.zzb.zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfaw(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfaw(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zza, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzefg
                            private final zzefh zza;
                            private final View zzb;
                            private final zzezz zzc;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                                this.zzb = zza;
                                this.zzc = zzezzVar;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfrk
                            public final zzfsm zza(Object obj) {
                                return this.zza.zzc(this.zzb, this.zzc, obj);
                            }
                        }, zzchg.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfaw(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfaw(e2);
            }
        }
        zzcvi zzaa = this.zzb.zzaa(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzcvo(zza, null, zzeff.zzb(zzeefVar.zzb), zzezzVar.zzu.get(0)));
        zzaa.zzj().zza(zza);
        zzaa.zza().zzi(new zzcsw(zzeefVar.zzb), this.zzc);
        zzeefVar.zzc.zzc(zzaa.zzf());
        return zzaa.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzc(View view, zzezz zzezzVar, Object obj) throws Exception {
        return zzfsd.zza(zzcwv.zza(this.zza, view, zzezzVar));
    }
}
