package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbwb extends zzbvg {
    private final String zza;
    private final int zzb;

    public zzbwb(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbwb(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
