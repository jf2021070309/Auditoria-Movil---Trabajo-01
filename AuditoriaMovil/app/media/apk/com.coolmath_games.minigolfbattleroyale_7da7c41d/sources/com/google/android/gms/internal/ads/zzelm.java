package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzelm implements zzbcv, zzdio {
    private zzbex zza;

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final synchronized void onAdClicked() {
        zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            try {
                zzbexVar.zzb();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(zzbex zzbexVar) {
        this.zza = zzbexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final synchronized void zzb() {
        zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            try {
                zzbexVar.zzb();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
