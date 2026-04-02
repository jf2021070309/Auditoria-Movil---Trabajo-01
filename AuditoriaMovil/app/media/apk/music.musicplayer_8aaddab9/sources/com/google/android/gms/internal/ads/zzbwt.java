package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzbwt implements Runnable {
    public final /* synthetic */ zzbww zza;

    public zzbwt(zzbww zzbwwVar) {
        this.zza = zzbwwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvm zzbvmVar;
        try {
            zzbvmVar = this.zza.zza;
            zzbvmVar.zzf();
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }
}
