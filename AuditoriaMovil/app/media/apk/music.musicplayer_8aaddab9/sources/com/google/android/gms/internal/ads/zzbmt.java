package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class zzbmt extends zzadk implements zzbmu {
    public static zzbmu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbmu ? (zzbmu) queryLocalInterface : new zzbms(iBinder);
    }
}
