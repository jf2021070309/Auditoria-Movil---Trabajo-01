package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqt {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbqp zzc;

    public zzbqt(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbjl.zza(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgJ)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) zzbet.zzc().zzc(zzbjl.zzgL)).intValue()) {
                zzcgt.zzd("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = zzber.zzb().zzs(this.zza, new zzbvd(), this.zzb);
    }

    public final boolean zza(String str) {
        if (zzc(str)) {
            zzd();
            zzbqp zzbqpVar = this.zzc;
            if (zzbqpVar != null) {
                try {
                    zzbqpVar.zze(str);
                    return true;
                } catch (RemoteException e) {
                    zzcgt.zzl("#007 Could not call remote method.", e);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void zzb() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgJ)).booleanValue()) {
            zzd();
            zzbqp zzbqpVar = this.zzc;
            if (zzbqpVar != null) {
                try {
                    zzbqpVar.zzf();
                } catch (RemoteException e) {
                    zzcgt.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
