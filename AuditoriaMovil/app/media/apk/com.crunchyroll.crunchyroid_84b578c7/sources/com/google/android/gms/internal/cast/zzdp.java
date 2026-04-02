package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzdp extends zzdu {
    final /* synthetic */ zzdv zza;
    final /* synthetic */ zzdq zzb;

    public zzdp(zzdq zzdqVar, zzdv zzdvVar) {
        this.zzb = zzdqVar;
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdv
    public final void zzb(int i) throws RemoteException {
        Logger logger;
        CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks;
        CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks2;
        logger = zzdq.zze;
        logger.d("onRemoteDisplayEnded", new Object[0]);
        zzdv zzdvVar = this.zza;
        if (zzdvVar != null) {
            zzdvVar.zzb(i);
        }
        zzdq zzdqVar = this.zzb;
        castRemoteDisplaySessionCallbacks = zzdqVar.zzf;
        if (castRemoteDisplaySessionCallbacks != null) {
            castRemoteDisplaySessionCallbacks2 = zzdqVar.zzf;
            castRemoteDisplaySessionCallbacks2.onRemoteDisplayEnded(new Status(i));
        }
    }
}
