package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbev extends zzadj implements zzbex {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzb() throws RemoteException {
        zzbj(1, zza());
    }
}
