package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbeb extends zzbeq<zzbqp> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvg zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeb(zzbep zzbepVar, Context context, zzbvg zzbvgVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbvgVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbqp zza() {
        return new zzbqw();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbqp zzb() throws RemoteException {
        try {
            return ((zzbqs) zzcgx.zza(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzbea.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 213806000, new zzbqj(this.zzc));
        } catch (RemoteException | zzcgw | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbqp zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, 213806000, new zzbqj(this.zzc));
    }
}
