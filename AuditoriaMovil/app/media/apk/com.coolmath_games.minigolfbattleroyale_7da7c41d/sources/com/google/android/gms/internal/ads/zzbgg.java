package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgg extends zzadj implements zzbgi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }
}
