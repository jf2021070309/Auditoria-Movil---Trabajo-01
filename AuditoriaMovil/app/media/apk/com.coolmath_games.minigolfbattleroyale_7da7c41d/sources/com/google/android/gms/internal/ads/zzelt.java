package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzelt {
    private final zzely<zzcxg> zza;
    private final String zzb;
    private zzbgz zzc;

    public zzelt(zzely<zzcxg> zzelyVar, String str) {
        this.zza = zzelyVar;
        this.zzb = str;
    }

    public final synchronized boolean zzb() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzc(zzbdg zzbdgVar, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zza(zzbdgVar, this.zzb, new zzelz(i), new zzels(this));
    }

    public final synchronized String zzd() {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzbgzVar != null ? zzbgzVar.zze() : null;
    }

    public final synchronized String zze() {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzbgzVar != null ? zzbgzVar.zze() : null;
    }
}
