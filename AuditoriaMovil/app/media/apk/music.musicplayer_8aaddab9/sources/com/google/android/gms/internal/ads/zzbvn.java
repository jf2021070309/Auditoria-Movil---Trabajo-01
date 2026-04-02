package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzbvn extends zzadj implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final IObjectWrapper zze() throws RemoteException {
        return a.P(zzbi(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final boolean zzf() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        boolean zza = zzadl.zza(zzbi);
        zzbi.recycle();
        return zza;
    }
}
