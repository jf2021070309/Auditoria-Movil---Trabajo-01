package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcah {
    private static zzcfn zzd;
    private final Context zza;
    private final AdFormat zzb;
    private final zzbhj zzc;

    public zzcah(Context context, AdFormat adFormat, zzbhj zzbhjVar) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzbhjVar;
    }

    public static zzcfn zza(Context context) {
        zzcfn zzcfnVar;
        synchronized (zzcah.class) {
            if (zzd == null) {
                zzd = zzber.zzb().zzq(context, new zzbvd());
            }
            zzcfnVar = zzd;
        }
        return zzcfnVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbdg zza;
        zzcfn zza2 = zza(this.zza);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        if (this.zzc != null) {
            zza = zzbdk.zza.zza(this.zza, this.zzc);
        } else {
            zza = new zzbdh().zza();
        }
        try {
            zza2.zze(wrap, new zzcfr(null, this.zzb.name(), null, zza), new zzcag(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
