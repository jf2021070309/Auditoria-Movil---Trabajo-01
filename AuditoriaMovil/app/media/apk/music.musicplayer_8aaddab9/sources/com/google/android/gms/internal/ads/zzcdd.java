package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* loaded from: classes.dex */
public final /* synthetic */ class zzcdd implements zzcgv {
    public static final zzcgv zza = new zzcdd();

    private zzcdd() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof zzccw ? (zzccw) queryLocalInterface : new zzccw(obj);
    }
}
