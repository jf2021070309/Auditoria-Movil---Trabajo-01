package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
/* loaded from: classes.dex */
public final class zzbwp implements Runnable {
    public final /* synthetic */ AdRequest.ErrorCode zza;
    public final /* synthetic */ zzbww zzb;

    public zzbwp(zzbww zzbwwVar, AdRequest.ErrorCode errorCode) {
        this.zzb = zzbwwVar;
        this.zza = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvm zzbvmVar;
        try {
            zzbvmVar = this.zzb.zza;
            zzbvmVar.zzg(zzbwx.zza(this.zza));
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }
}
