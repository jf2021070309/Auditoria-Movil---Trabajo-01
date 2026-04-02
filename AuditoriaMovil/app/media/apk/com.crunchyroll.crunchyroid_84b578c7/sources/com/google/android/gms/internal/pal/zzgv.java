package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzgv extends zzfk implements zzgw {
    public static zzgw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        if (queryLocalInterface instanceof zzgw) {
            return (zzgw) queryLocalInterface;
        }
        return new zzgu(iBinder);
    }
}
