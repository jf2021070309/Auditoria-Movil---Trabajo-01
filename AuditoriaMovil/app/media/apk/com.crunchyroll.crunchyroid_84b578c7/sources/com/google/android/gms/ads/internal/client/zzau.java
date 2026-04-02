package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsv zzbsvVar;
        zzbgl zzbglVar;
        zzbbf.zza(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zzjf)).booleanValue()) {
            zzbglVar = this.zzd.zzg;
            return zzbglVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbeu.zze(((zzbey) zzbzs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    return zzbex.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzbzr | NullPointerException e) {
            this.zzd.zzh = zzbst.zza(this.zza.getContext());
            zzbsvVar = this.zzd.zzh;
            zzbsvVar.zzf(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
