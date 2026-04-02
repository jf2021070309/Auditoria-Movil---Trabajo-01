package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbjh {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbjd zzc;

    public zzbjh(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbbf.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zziS)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) zzba.zzc().zzb(zzbbf.zziU)).intValue()) {
            zzbzo.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = zzay.zza().zzl(this.zza, new zzbnq(), this.zzb);
    }

    public final void zza() {
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zziS)).booleanValue()) {
            return;
        }
        zzd();
        zzbjd zzbjdVar = this.zzc;
        if (zzbjdVar != null) {
            try {
                zzbjdVar.zze();
            } catch (RemoteException e) {
                zzbzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbjd zzbjdVar = this.zzc;
        if (zzbjdVar == null) {
            return false;
        }
        try {
            zzbjdVar.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
