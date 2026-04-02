package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzelm implements zzbcv, zzdio {
    @GuardedBy("this")
    private zzbex zza;

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final synchronized void onAdClicked() {
        zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            try {
                zzbexVar.zzb();
            } catch (RemoteException e2) {
                zzcgt.zzj("Remote Exception at onAdClicked.", e2);
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
            } catch (RemoteException e2) {
                zzcgt.zzj("Remote Exception at onPhysicalClick.", e2);
            }
        }
    }
}
