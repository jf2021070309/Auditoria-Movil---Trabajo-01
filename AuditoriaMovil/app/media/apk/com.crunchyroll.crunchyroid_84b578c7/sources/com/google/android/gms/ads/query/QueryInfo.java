package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbzd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzemVar) {
        this.zza = zzemVar;
    }

    public static void generate(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdx zza;
        zzbbf.zza(context);
        if (((Boolean) zzbcw.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbf.zzjA)).booleanValue()) {
                zzbzd.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdx zza2;
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        if (adRequest2 == null) {
                            zza2 = null;
                        } else {
                            zza2 = adRequest2.zza();
                        }
                        new zzbsh(context2, adFormat2, zza2).zzb(queryInfoGenerationCallback2);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zza = null;
        } else {
            zza = adRequest.zza();
        }
        new zzbsh(context, adFormat, zza).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }
}
