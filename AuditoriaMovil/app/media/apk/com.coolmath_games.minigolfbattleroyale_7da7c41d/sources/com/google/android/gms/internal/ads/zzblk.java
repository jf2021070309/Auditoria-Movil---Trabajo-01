package com.google.android.gms.internal.ads;

import com.vungle.warren.AdLoader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzblk {
    public static final zzbkn<Boolean> zza = zzbkn.zza("gads:always_collect_trustless_token_at_native_side", true);
    public static final zzbkn<Boolean> zzb = zzbkn.zza("gms:expose_token_for_gma:enabled", false);
    public static final zzbkn<Long> zzc = zzbkn.zzb("gads:timeout_for_trustless_token:millis", AdLoader.RETRY_DELAY);
    public static final zzbkn<Long> zzd = zzbkn.zzb("gads:cached_token:ttl_millis", 10800000);
}
