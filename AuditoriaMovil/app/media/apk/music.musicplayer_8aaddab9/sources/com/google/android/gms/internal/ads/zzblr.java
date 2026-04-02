package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzblr extends zzbmg {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzblr(Drawable drawable, Uri uri, double d2, int i2, int i3) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d2;
        this.zzd = i2;
        this.zze = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final Uri zzc() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zzf() {
        return this.zze;
    }
}
