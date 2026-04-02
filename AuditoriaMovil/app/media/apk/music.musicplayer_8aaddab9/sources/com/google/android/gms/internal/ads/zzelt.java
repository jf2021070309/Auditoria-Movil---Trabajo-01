package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzelt {
    private final zzely<zzcxg> zza;
    private final String zzb;
    @GuardedBy("this")
    private zzbgz zzc;

    public zzelt(zzely<zzcxg> zzelyVar, String str) {
        this.zza = zzelyVar;
        this.zzb = str;
    }

    public final synchronized boolean zzb() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzc(zzbdg zzbdgVar, int i2) throws RemoteException {
        this.zzc = null;
        this.zza.zza(zzbdgVar, this.zzb, new zzelz(i2), new zzels(this));
    }

    public final synchronized String zzd() {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zzc;
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzbgzVar != null ? zzbgzVar.zze() : null;
    }

    public final synchronized String zze() {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zzc;
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzbgzVar != null ? zzbgzVar.zze() : null;
    }
}
