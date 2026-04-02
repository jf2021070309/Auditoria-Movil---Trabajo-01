package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class zzbsf extends zzadk implements zzbsg {
    public static zzbsg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbsg ? (zzbsg) queryLocalInterface : new zzbse(iBinder);
    }
}
