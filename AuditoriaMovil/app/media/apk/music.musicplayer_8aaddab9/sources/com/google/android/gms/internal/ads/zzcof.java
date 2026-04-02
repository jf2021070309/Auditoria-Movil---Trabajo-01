package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class zzcof extends zzadk implements zzcog {
    public static zzcog zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzcog ? (zzcog) queryLocalInterface : new zzcoe(iBinder);
    }
}
