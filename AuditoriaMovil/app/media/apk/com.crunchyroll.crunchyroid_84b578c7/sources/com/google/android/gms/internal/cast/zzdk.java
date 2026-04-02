package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzdk extends zzdi {
    final /* synthetic */ zzdl zza;

    public zzdk(zzdl zzdlVar) {
        this.zza = zzdlVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdi, com.google.android.gms.internal.cast.zzds
    public final void zzd(int i) throws RemoteException {
        Logger logger;
        logger = zzdn.zza;
        logger.d("onError: %d", Integer.valueOf(i));
        zzdn.zzf(this.zza.zzc);
        this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
    }

    @Override // com.google.android.gms.internal.cast.zzdi, com.google.android.gms.internal.cast.zzds
    public final void zzf() throws RemoteException {
        Logger logger;
        logger = zzdn.zza;
        logger.d("onDisconnected", new Object[0]);
        zzdn.zzf(this.zza.zzc);
        this.zza.setResult((zzdl) new zzdm(Status.RESULT_SUCCESS));
    }
}
