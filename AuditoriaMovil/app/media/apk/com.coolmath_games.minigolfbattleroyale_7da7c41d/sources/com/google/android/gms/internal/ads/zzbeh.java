package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbeh extends zzbeq<zzbfj> {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvg zzc;
    final /* synthetic */ zzbep zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeh(zzbep zzbepVar, Context context, String str, zzbvg zzbvgVar) {
        this.zzd = zzbepVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbfj zza() {
        zzbep.zzi(this.zza, "native_ad");
        return new zzbib();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfj zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbfj zzbfhVar;
        zzbdd zzbddVar;
        zzbjl.zza(this.zza);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                IBinder zze = ((zzbfk) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzbeg.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbfj) {
                    zzbfhVar = (zzbfj) queryLocalInterface;
                } else {
                    zzbfhVar = new zzbfh(zze);
                }
                return zzbfhVar;
            } catch (RemoteException | zzcgw | NullPointerException e) {
                this.zzd.zzh = zzcar.zza(this.zza);
                zzcatVar = this.zzd.zzh;
                zzcatVar.zzd(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzbddVar = this.zzd.zzb;
        return zzbddVar.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfj zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
    }
}
