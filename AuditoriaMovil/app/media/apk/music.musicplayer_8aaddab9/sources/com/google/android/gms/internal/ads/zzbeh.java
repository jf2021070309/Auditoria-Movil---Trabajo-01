package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbeh extends zzbeq<zzbfj> {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbvg zzc;
    public final /* synthetic */ zzbep zzd;

    public zzbeh(zzbep zzbepVar, Context context, String str, zzbvg zzbvgVar) {
        this.zzd = zzbepVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfj zza() {
        zzbep.zzi(this.zza, "native_ad");
        return new zzbib();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfj zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbdd zzbddVar;
        zzbjl.zza(this.zza);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            zzbddVar = this.zzd.zzb;
            return zzbddVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbfk) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzbeg.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbfj ? (zzbfj) queryLocalInterface : new zzbfh(zze);
        } catch (RemoteException | zzcgw | NullPointerException e2) {
            this.zzd.zzh = zzcar.zza(this.zza);
            zzcatVar = this.zzd.zzh;
            zzcatVar.zzd(e2, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfj zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
    }
}
