package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbfp extends zzadj implements zzbfr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }
}
