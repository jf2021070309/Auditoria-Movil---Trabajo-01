package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefn implements zzeek<zzcvh, zzbxn, zzefy> {
    private final Context zza;
    private final zzcwe zzb;
    private View zzc;
    private zzbvp zzd;

    public zzefn(Context context, zzcwe zzcweVar) {
        this.zza = context;
        this.zzb = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzbxn, zzefy> zzeefVar) throws zzfaw {
        try {
            zzeefVar.zzb.zzo(zzezzVar.zzV);
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() || !zzezzVar.zzad) {
                zzeefVar.zzb.zzi(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefl(this, zzeefVar, null), zzeefVar.zzc, zzfalVar.zza.zza.zze);
            } else {
                zzeefVar.zzb.zzq(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefl(this, zzeefVar, null), zzeefVar.zzc, zzfalVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfaw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzcvh zzb(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzbxn, zzefy> zzeefVar) throws zzfaw, zzehs {
        View view;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() && zzezzVar.zzad) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfaw(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, view, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzefk
                            private final zzefn zza;
                            private final View zzb;
                            private final zzezz zzc;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                                this.zzb = view;
                                this.zzc = zzezzVar;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfrk
                            public final zzfsm zza(Object obj) {
                                return this.zza.zze(this.zzb, this.zzc, obj);
                            }
                        }, zzchg.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfaw(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfaw(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcvi zzaa = this.zzb.zzaa(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzcvo(view, null, new zzcxe(zzeefVar) { // from class: com.google.android.gms.internal.ads.zzefj
            private final zzeef zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeefVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcxe
            public final zzbhc zza() {
                try {
                    return ((zzbxn) this.zza.zzb).zzh();
                } catch (RemoteException e3) {
                    throw new zzfaw(e3);
                }
            }
        }, zzezzVar.zzu.get(0)));
        zzaa.zzj().zza(view);
        zzeefVar.zzc.zzc(zzaa.zzg());
        return zzaa.zzh();
    }

    public final /* synthetic */ zzfsm zze(View view, zzezz zzezzVar, Object obj) throws Exception {
        return zzfsd.zza(zzcwv.zza(this.zza, view, zzezzVar));
    }
}
