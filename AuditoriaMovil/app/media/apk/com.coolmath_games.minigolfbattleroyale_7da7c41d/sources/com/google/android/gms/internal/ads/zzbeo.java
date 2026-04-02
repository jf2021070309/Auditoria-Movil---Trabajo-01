package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbeo extends zzbeq<zzccs> {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvg zzc;
    final /* synthetic */ zzbep zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeo(zzbep zzbepVar, Context context, String str, zzbvg zzbvgVar) {
        this.zzd = zzbepVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzccs zza() {
        zzbep.zzi(this.zza, "rewarded");
        return new zzbij();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzccs zzb() throws RemoteException {
        return zzcde.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzccs zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
    }
}
