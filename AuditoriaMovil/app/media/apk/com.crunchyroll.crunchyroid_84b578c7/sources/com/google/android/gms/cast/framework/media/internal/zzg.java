package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzg extends com.google.android.gms.internal.cast.zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zzi
    public final Bitmap zze(Uri uri) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, uri);
        Parcel zzb = zzb(1, zza);
        Bitmap bitmap = (Bitmap) com.google.android.gms.internal.cast.zzc.zza(zzb, Bitmap.CREATOR);
        zzb.recycle();
        return bitmap;
    }
}
