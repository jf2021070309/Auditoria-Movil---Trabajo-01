package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbej extends zzbeq<zzbge> {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbep zzb;

    public zzbej(zzbep zzbepVar, Context context) {
        this.zzb = zzbepVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zza() {
        zzbep.zzi(this.zza, "mobile_ads_settings");
        return new zzbif();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbhx zzbhxVar;
        zzbjl.zza(this.zza);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            zzbhxVar = this.zzb.zzc;
            return zzbhxVar.zza(this.zza);
        }
        try {
            IBinder zze = ((zzbgf) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzbei.zza)).zze(ObjectWrapper.wrap(this.zza), 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzbge ? (zzbge) queryLocalInterface : new zzbgc(zze);
        } catch (RemoteException | zzcgw | NullPointerException e2) {
            this.zzb.zzh = zzcar.zza(this.zza);
            zzcatVar = this.zzb.zzh;
            zzcatVar.zzd(e2, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzh(ObjectWrapper.wrap(this.zza), 213806000);
    }
}
