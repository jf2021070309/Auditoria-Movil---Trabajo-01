package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbee extends zzbeq<zzbfn> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbdl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbep zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbee(zzbep zzbepVar, Context context, zzbdl zzbdlVar, String str) {
        this.zzd = zzbepVar;
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zza() {
        zzbep.zzi(this.zza, "search");
        return new zzbid();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zzb() throws RemoteException {
        zzbdf zzbdfVar;
        zzbdfVar = this.zzd.zza;
        return zzbdfVar.zza(this.zza, this.zzb, this.zzc, null, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzi(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 213806000);
    }
}
