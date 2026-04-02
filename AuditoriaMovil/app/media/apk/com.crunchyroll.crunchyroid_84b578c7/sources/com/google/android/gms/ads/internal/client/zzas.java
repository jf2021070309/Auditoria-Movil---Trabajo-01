package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    public zzas(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzawVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsv zzbsvVar;
        zzbgk zzbgkVar;
        zzbbf.zza(this.zzc);
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zzjf)).booleanValue()) {
            zzbgkVar = this.zzd.zzd;
            return zzbgkVar.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbeo.zzbx(((zzbes) zzbzs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    return zzber.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 231004000));
        } catch (RemoteException | zzbzr | NullPointerException e) {
            this.zzd.zzh = zzbst.zza(this.zzc);
            zzbsvVar = this.zzd.zzh;
            zzbsvVar.zzf(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
