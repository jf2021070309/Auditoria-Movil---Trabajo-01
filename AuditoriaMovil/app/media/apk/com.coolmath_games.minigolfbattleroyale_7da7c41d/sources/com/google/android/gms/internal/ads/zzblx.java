package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzblx extends zzadj implements zzblz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final String zzb() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        String readString = zzbi.readString();
        zzbi.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final List<zzbmh> zzc() throws RemoteException {
        Parcel zzbi = zzbi(3, zza());
        ArrayList zzg = zzadl.zzg(zzbi);
        zzbi.recycle();
        return zzg;
    }
}
