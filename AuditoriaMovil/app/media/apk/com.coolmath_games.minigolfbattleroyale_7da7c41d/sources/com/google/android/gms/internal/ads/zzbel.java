package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbel extends zzbeq<zzbml> {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzbep zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbel(zzbep zzbepVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzbepVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbml zza() {
        zzbep.zzi(this.zzc, "native_ad_view_delegate");
        return new zzbig();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbml zzb() throws RemoteException {
        zzcat zzcatVar;
        zzbog zzbogVar;
        zzbjl.zza(this.zzc);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                return zzbmk.zzby(((zzbmo) zzcgx.zza(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzbek.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 213806000));
            } catch (RemoteException | zzcgw | NullPointerException e) {
                this.zzd.zzh = zzcar.zza(this.zzc);
                zzcatVar = this.zzd.zzh;
                zzcatVar.zzd(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzbogVar = this.zzd.zzd;
        return zzbogVar.zza(this.zzc, this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbml zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }
}
