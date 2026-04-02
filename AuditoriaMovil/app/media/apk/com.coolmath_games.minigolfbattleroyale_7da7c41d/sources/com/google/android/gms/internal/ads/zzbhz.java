package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbhz implements Runnable {
    final /* synthetic */ zzbia zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhz(zzbia zzbiaVar) {
        this.zza = zzbiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzbib.zzb(this.zza.zza) != null) {
            try {
                zzbib.zzb(this.zza.zza).zzc(1);
            } catch (RemoteException e) {
                zzcgt.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
