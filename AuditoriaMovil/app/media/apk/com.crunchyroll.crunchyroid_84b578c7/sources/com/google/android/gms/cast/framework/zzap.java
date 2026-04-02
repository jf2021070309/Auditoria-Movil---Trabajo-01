package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzap extends com.google.android.gms.internal.cast.zza implements zzaq {
    public zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // com.google.android.gms.cast.framework.zzaq
    public final IObjectWrapper zze() throws RemoteException {
        return b2.a(zzb(5, zza()));
    }
}
