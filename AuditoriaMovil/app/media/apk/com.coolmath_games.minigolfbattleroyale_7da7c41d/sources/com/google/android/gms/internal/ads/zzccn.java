package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzccn extends zzadj implements zzccp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zze() throws RemoteException {
        Parcel zzbi = zzbi(1, zza());
        String readString = zzbi.readString();
        zzbi.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final int zzf() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        int readInt = zzbi.readInt();
        zzbi.recycle();
        return readInt;
    }
}
