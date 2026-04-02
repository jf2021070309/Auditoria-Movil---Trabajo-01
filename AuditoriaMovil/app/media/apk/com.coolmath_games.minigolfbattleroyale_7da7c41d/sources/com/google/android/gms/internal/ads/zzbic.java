package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbic implements Runnable {
    final /* synthetic */ zzbid zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbic(zzbid zzbidVar) {
        this.zza = zzbidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfa zzbfaVar;
        zzbfa zzbfaVar2;
        zzbfaVar = this.zza.zza;
        if (zzbfaVar != null) {
            try {
                zzbfaVar2 = this.zza.zza;
                zzbfaVar2.zzc(1);
            } catch (RemoteException e) {
                zzcgt.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
