package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbde implements zzcgv {
    static final zzcgv zza = new zzbde();

    private zzbde() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbfo) {
            return (zzbfo) queryLocalInterface;
        }
        return new zzbfo(obj);
    }
}
