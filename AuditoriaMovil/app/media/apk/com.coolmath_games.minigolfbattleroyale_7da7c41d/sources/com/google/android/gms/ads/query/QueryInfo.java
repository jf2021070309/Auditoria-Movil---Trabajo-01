package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzcah;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzbhv zza;

    public QueryInfo(zzbhv zzbhvVar) {
        this.zza = zzbhvVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        new zzcah(context, adFormat, adRequest == null ? null : adRequest.zza()).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zza();
    }

    public Bundle getQueryBundle() {
        return this.zza.zzc();
    }

    public String getRequestId() {
        return this.zza.zzb();
    }

    public final zzbhv zza() {
        return this.zza;
    }
}
