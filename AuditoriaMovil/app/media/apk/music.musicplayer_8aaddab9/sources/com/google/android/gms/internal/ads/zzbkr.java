package com.google.android.gms.internal.ads;

import ch.qos.logback.core.spi.AbstractComponentTracker;
/* loaded from: classes.dex */
public final class zzbkr {
    public static final zzbkn<Boolean> zza = zzbko.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbkn<Boolean> zzb = zzbko.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbkn<String> zzc = new zzbko("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbkn<Long> zzd = new zzbko("gads:consent:gmscore:time_out", Long.valueOf((long) AbstractComponentTracker.LINGERING_TIMEOUT), 2);
    public static final zzbkn<Boolean> zze = zzbko.zzf("gads:consent:gmscore:enabled", true);
}
