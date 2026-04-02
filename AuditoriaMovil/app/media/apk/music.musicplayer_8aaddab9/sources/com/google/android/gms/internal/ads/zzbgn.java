package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
/* loaded from: classes.dex */
public final class zzbgn implements MuteThisAdReason {
    private final String zza;
    private final zzbgm zzb;

    public zzbgn(zzbgm zzbgmVar) {
        String str;
        this.zzb = zzbgmVar;
        try {
            str = zzbgmVar.zze();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzbgm zza() {
        return this.zzb;
    }
}
