package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcdc implements RewardItem {
    private final zzccp zza;

    public zzcdc(zzccp zzccpVar) {
        this.zza = zzccpVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccp zzccpVar = this.zza;
        if (zzccpVar != null) {
            try {
                return zzccpVar.zzf();
            } catch (RemoteException e) {
                zzcgt.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccp zzccpVar = this.zza;
        if (zzccpVar != null) {
            try {
                return zzccpVar.zze();
            } catch (RemoteException e) {
                zzcgt.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
