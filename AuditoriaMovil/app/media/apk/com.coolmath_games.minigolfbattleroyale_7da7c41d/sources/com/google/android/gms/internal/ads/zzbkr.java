package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbkr {
    public static final zzbkn<Boolean> zza = zzbko.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbkn<Boolean> zzb = zzbko.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbkn<String> zzc = new zzbko("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbkn<Long> zzd = new zzbko("gads:consent:gmscore:time_out", Long.valueOf((long) WorkRequest.MIN_BACKOFF_MILLIS), 2);
    public static final zzbkn<Boolean> zze = zzbko.zzf("gads:consent:gmscore:enabled", true);
}
