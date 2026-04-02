package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbwm implements Runnable {
    final /* synthetic */ zzbww zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwm(zzbww zzbwwVar) {
        this.zza = zzbwwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvm zzbvmVar;
        try {
            zzbvmVar = this.zza.zza;
            zzbvmVar.zzj();
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
