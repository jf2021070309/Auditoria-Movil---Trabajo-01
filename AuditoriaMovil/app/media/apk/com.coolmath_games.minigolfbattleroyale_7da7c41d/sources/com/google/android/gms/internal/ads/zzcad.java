package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcad extends zzadj implements zzcaf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(List<Uri> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbj(2, zza);
    }
}
