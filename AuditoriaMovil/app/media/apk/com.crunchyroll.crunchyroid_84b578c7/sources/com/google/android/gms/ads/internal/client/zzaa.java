package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    public zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsv zzbsvVar;
        zzbrn zzbrnVar;
        zzbbf.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zzjf)).booleanValue()) {
            zzbrnVar = this.zzb.zzf;
            return zzbrnVar.zza(this.zza);
        }
        try {
            return zzbrp.zzG(((zzbrt) zzbzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    return zzbrs.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzbzr | NullPointerException e) {
            this.zzb.zzh = zzbst.zza(this.zza.getApplicationContext());
            zzbsvVar = this.zzb.zzh;
            zzbsvVar.zzf(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
