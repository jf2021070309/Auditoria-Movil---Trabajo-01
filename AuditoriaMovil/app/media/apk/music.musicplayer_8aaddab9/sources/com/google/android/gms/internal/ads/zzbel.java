package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbel extends zzbeq<zzbml> {
    public final /* synthetic */ FrameLayout zza;
    public final /* synthetic */ FrameLayout zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ zzbep zzd;

    public zzbel(zzbep zzbepVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzbepVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbml zza() {
        zzbep.zzi(this.zzc, "native_ad_view_delegate");
        return new zzbig();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbml zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbog zzbogVar;
        zzbjl.zza(this.zzc);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            zzbogVar = this.zzd.zzd;
            return zzbogVar.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbmk.zzby(((zzbmo) zzcgx.zza(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzbek.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 213806000));
        } catch (RemoteException | zzcgw | NullPointerException e2) {
            this.zzd.zzh = zzcar.zza(this.zzc);
            zzcatVar = this.zzd.zzh;
            zzcatVar.zzd(e2, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbml zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }
}
