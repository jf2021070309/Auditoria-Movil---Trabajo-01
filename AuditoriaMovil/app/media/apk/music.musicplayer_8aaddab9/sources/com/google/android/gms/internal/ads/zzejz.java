package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzejz {
    private final ConcurrentHashMap<String, zzbxn> zza = new ConcurrentHashMap<>();
    private final zzdtf zzb;

    public zzejz(zzdtf zzdtfVar) {
        this.zzb = zzdtfVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzc(str));
        } catch (RemoteException e2) {
            zzcgt.zzg("Couldn't create RTB adapter : ", e2);
        }
    }

    @CheckForNull
    public final zzbxn zzb(String str) {
        if (this.zza.containsKey(str)) {
            return this.zza.get(str);
        }
        return null;
    }
}
