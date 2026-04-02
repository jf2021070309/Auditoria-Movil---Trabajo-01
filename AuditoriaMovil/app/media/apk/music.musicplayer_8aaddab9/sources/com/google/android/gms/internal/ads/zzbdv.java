package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbdv extends zzbeq<zzbzq> {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzbep zzb;

    public zzbdv(zzbep zzbepVar, Activity activity) {
        this.zzb = zzbepVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbzq zza() {
        zzbep.zzi(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbzq zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbzn zzbznVar;
        zzbjl.zza(this.zza);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            zzbznVar = this.zzb.zzf;
            return zzbznVar.zza(this.zza);
        }
        try {
            return zzbzp.zzF(((zzbzt) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzbdu.zza)).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzcgw | NullPointerException e2) {
            this.zzb.zzh = zzcar.zza(this.zza.getApplicationContext());
            zzcatVar = this.zzb.zzh;
            zzcatVar.zzd(e2, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbzq zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
