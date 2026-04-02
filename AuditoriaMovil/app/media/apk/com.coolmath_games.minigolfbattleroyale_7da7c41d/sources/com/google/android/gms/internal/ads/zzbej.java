package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbej extends zzbeq<zzbge> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbep zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbej(zzbep zzbepVar, Context context) {
        this.zzb = zzbepVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbge zza() {
        zzbep.zzi(this.zza, "mobile_ads_settings");
        return new zzbif();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbge zzbgcVar;
        zzbhx zzbhxVar;
        zzbjl.zza(this.zza);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                IBinder zze = ((zzbgf) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzbei.zza)).zze(ObjectWrapper.wrap(this.zza), 213806000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzbge) {
                    zzbgcVar = (zzbge) queryLocalInterface;
                } else {
                    zzbgcVar = new zzbgc(zze);
                }
                return zzbgcVar;
            } catch (RemoteException | zzcgw | NullPointerException e) {
                this.zzb.zzh = zzcar.zza(this.zza);
                zzcatVar = this.zzb.zzh;
                zzcatVar.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzbhxVar = this.zzb.zzc;
        return zzbhxVar.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzh(ObjectWrapper.wrap(this.zza), 213806000);
    }
}
