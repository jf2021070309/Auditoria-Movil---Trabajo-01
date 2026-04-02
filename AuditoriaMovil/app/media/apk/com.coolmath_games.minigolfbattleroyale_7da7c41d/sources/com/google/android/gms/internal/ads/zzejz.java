package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzejz {
    private final ConcurrentHashMap<String, zzbxn> zza = new ConcurrentHashMap<>();
    private final zzdtf zzb;

    public zzejz(zzdtf zzdtfVar) {
        this.zzb = zzdtfVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzc(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Couldn't create RTB adapter : ", e);
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
