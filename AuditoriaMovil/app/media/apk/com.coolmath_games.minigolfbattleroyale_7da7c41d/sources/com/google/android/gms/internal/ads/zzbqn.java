package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqn extends zzadj implements zzbqp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf() throws RemoteException {
        zzbj(2, zza());
    }
}
