package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    public zzaq(zzaw zzawVar, Context context) {
        this.zzb = zzawVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzg(ObjectWrapper.wrap(this.zza), 231004000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzeq zzeqVar;
        zzbsv zzbsvVar;
        Object zzcmVar;
        zzbbf.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zzjf)).booleanValue()) {
            zzeqVar = this.zzb.zzc;
            return zzeqVar.zza(this.zza);
        }
        try {
            IBinder zze = ((zzcp) zzbzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    if (queryLocalInterface instanceof zzcp) {
                        return (zzcp) queryLocalInterface;
                    }
                    return new zzcp(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), 231004000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(zze);
            }
            return zzcmVar;
        } catch (RemoteException | zzbzr | NullPointerException e) {
            this.zzb.zzh = zzbst.zza(this.zza);
            zzbsvVar = this.zzb.zzh;
            zzbsvVar.zzf(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
