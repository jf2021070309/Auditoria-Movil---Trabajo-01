package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbmn extends zzadk implements zzbmo {
    public static zzbmo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbmo) {
            return (zzbmo) queryLocalInterface;
        }
        return new zzbmm(iBinder);
    }
}
