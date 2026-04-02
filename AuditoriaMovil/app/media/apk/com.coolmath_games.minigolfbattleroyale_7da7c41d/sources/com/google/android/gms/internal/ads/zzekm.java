package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzekm extends zzbff {
    private final zzelt zza;

    public zzekm(Context context, zzcoj zzcojVar, zzfap zzfapVar, zzdmx zzdmxVar, zzbfa zzbfaVar) {
        zzelv zzelvVar = new zzelv(zzdmxVar, zzcojVar.zzd());
        zzelvVar.zza(zzbfaVar);
        this.zza = new zzelt(new zzemf(zzcojVar, context, zzelvVar, zzfapVar), zzfapVar.zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zze(zzbdg zzbdgVar) throws RemoteException {
        this.zza.zzc(zzbdgVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized String zzf() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized String zzh() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void zzi(zzbdg zzbdgVar, int i) throws RemoteException {
        this.zza.zzc(zzbdgVar, i);
    }
}
