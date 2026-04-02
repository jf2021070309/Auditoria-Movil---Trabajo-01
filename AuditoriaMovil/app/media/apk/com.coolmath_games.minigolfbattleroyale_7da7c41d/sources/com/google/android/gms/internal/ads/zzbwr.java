package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbwr implements Runnable {
    final /* synthetic */ zzbww zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwr(zzbww zzbwwVar) {
        this.zza = zzbwwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvm zzbvmVar;
        try {
            zzbvmVar = this.zza.zza;
            zzbvmVar.zzi();
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
