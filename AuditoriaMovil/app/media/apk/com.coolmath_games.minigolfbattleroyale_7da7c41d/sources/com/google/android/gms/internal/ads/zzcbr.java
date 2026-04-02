package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcbr {
    private final WeakHashMap<Context, zzcbq> zza = new WeakHashMap<>();

    public final Future<zzcbo> zzb(Context context) {
        return zzchg.zza.zzb(new zzcbp(this, context));
    }
}
