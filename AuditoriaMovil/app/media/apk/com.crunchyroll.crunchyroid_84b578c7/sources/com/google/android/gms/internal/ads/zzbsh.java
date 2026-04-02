package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbsh {
    private static zzbyf zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzdx zzd;

    public zzbsh(Context context, AdFormat adFormat, zzdx zzdxVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
    }

    public static zzbyf zza(Context context) {
        zzbyf zzbyfVar;
        synchronized (zzbsh.class) {
            if (zza == null) {
                zza = zzay.zza().zzr(context, new zzbnq());
            }
            zzbyfVar = zza;
        }
        return zzbyfVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zza2;
        zzbyf zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        zzdx zzdxVar = this.zzd;
        if (zzdxVar == null) {
            zza2 = new zzm().zza();
        } else {
            zza2 = zzp.zza.zza(this.zzb, zzdxVar);
        }
        try {
            zza3.zze(wrap, new zzbyj(null, this.zzc.name(), null, zza2), new zzbsg(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
