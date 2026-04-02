package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgk extends zzadj implements zzbgm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final String zze() throws RemoteException {
        Parcel zzbi = zzbi(1, zza());
        String readString = zzbi.readString();
        zzbi.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final String zzf() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        String readString = zzbi.readString();
        zzbi.recycle();
        return readString;
    }
}
