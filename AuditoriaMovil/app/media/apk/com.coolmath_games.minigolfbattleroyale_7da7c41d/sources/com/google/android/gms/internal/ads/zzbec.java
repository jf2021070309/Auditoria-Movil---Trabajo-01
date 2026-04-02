package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbec extends zzbeq<zzbfn> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbdl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbvg zzd;
    final /* synthetic */ zzbep zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbec(zzbep zzbepVar, Context context, zzbdl zzbdlVar, String str, zzbvg zzbvgVar) {
        this.zze = zzbepVar;
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = str;
        this.zzd = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zza() {
        zzbep.zzi(this.zza, "banner");
        return new zzbid();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zzb() throws RemoteException {
        zzbdf zzbdfVar;
        zzbdfVar = this.zze.zza;
        return zzbdfVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 213806000);
    }
}
