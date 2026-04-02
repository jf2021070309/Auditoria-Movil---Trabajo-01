package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class zzgx {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzan zza;
    public final Uri zzb;
    public final Map<String, List<String>> zzc;

    public zzgx(long j2, zzan zzanVar, Uri uri, Map<String, List<String>> map, long j3, long j4, long j5) {
        this.zza = zzanVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
