package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* loaded from: classes.dex */
public final /* synthetic */ class zzbei implements zzcgv {
    public static final zzcgv zza = new zzbei();

    private zzbei() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzbgf ? (zzbgf) queryLocalInterface : new zzbgf(obj);
    }
}
