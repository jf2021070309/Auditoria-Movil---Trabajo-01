package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbvu implements RewardItem {
    private final zzbvh zza;

    public zzbvu(zzbvh zzbvhVar) {
        this.zza = zzbvhVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            try {
                return zzbvhVar.zze();
            } catch (RemoteException e) {
                zzbzo.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            try {
                return zzbvhVar.zzf();
            } catch (RemoteException e) {
                zzbzo.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
