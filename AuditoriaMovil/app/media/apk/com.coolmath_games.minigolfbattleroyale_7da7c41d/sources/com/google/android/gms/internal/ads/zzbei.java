package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbei implements zzcgv {
    static final zzcgv zza = new zzbei();

    private zzbei() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzbgf) {
            return (zzbgf) queryLocalInterface;
        }
        return new zzbgf(obj);
    }
}
