package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class zzcfp extends zzadk implements zzcfq {
    public static zzcfq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof zzcfq ? (zzcfq) queryLocalInterface : new zzcfo(iBinder);
    }
}
