package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdrr extends VideoController.VideoLifecycleCallbacks {
    private final zzdmm zza;

    public zzdrr(zzdmm zzdmmVar) {
        this.zza = zzdmmVar;
    }

    private static zzbhf zza(zzdmm zzdmmVar) {
        zzbhc zzw = zzdmmVar.zzw();
        if (zzw == null) {
            return null;
        }
        try {
            return zzw.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzbhf zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzbhf zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzbhf zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }
}
