package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbwp implements Runnable {
    final /* synthetic */ AdRequest.ErrorCode zza;
    final /* synthetic */ zzbww zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
