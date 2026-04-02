package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* loaded from: classes.dex */
public final /* synthetic */ class zzbeg implements zzcgv {
    public static final zzcgv zza = new zzbeg();

    private zzbeg() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbfk ? (zzbfk) queryLocalInterface : new zzbfk(obj);
    }
}
