package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbdx extends zzbeq<zzcfn> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdx(zzbep zzbepVar, Context context, zzbvg zzbvgVar) {
        this.zza = context;
        this.zzb = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzcfn zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzcfn zzb() throws RemoteException {
        try {
            return ((zzcfq) zzcgx.zza(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzbdw.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 213806000);
        } catch (RemoteException | zzcgw | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzcfn zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzm(ObjectWrapper.wrap(this.zza), this.zzb, 213806000);
    }
}
