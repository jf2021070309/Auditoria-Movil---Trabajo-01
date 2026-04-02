package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcah {
    @GuardedBy("InternalQueryInfoGenerator.class")
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
        zzcfn zza = zza(this.zza);
        if (zza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbhj zzbhjVar = this.zzc;
        try {
            zza.zze(wrap, new zzcfr(null, this.zzb.name(), null, zzbhjVar == null ? new zzbdh().zza() : zzbdk.zza.zza(this.zza, zzbhjVar)), new zzcag(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
