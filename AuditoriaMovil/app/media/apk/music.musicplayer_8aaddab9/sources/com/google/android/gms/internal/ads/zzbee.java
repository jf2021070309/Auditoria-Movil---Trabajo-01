package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzbee extends zzbeq<zzbfn> {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbdl zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzbep zzd;

    public zzbee(zzbep zzbepVar, Context context, zzbdl zzbdlVar, String str) {
        this.zzd = zzbepVar;
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbfn zza() {
        zzbep.zzi(this.zza, AppLovinEventTypes.USER_EXECUTED_SEARCH);
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
