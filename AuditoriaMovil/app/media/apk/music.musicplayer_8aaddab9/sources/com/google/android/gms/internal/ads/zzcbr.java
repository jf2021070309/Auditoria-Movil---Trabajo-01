package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class zzcbr {
    private final WeakHashMap<Context, zzcbq> zza = new WeakHashMap<>();

    public final Future<zzcbo> zzb(Context context) {
        return zzchg.zza.zzb(new zzcbp(this, context));
    }
}
