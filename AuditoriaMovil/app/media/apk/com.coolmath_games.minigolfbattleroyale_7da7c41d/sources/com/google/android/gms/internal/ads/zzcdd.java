package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzcdd implements zzcgv {
    static final zzcgv zza = new zzcdd();

    private zzcdd() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzccw) {
            return (zzccw) queryLocalInterface;
        }
        return new zzccw(obj);
    }
}
