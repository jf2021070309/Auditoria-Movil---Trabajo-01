package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzbhz implements Runnable {
    public final /* synthetic */ zzbia zza;

    public zzbhz(zzbia zzbiaVar) {
        this.zza = zzbiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzbib.zzb(this.zza.zza) != null) {
            try {
                zzbib.zzb(this.zza.zza).zzc(1);
            } catch (RemoteException e2) {
                zzcgt.zzj("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
