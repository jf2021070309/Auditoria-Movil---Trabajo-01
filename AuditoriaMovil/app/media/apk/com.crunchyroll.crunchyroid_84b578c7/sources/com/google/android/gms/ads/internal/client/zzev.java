package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
final class zzev implements Runnable {
    final /* synthetic */ zzew zza;

    public zzev(zzew zzewVar) {
        this.zza = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzew zzewVar = this.zza;
        zzbhVar = zzewVar.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzewVar.zza;
                zzbhVar2.zze(1);
            } catch (RemoteException e) {
                zzbzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
