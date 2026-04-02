package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzb extends com.google.android.gms.internal.cast.zza implements zzd {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // com.google.android.gms.cast.framework.media.zzd
    public final WebImage zze(MediaMetadata mediaMetadata, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.zzd
    public final WebImage zzf(MediaMetadata mediaMetadata, ImageHints imageHints) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.zzd
    public final IObjectWrapper zzg() throws RemoteException {
        return b2.a(zzb(2, zza()));
    }
}
