package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes.dex */
public final class zzfgv {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfgv zza = new zzfgv();
    private Context zzb;

    private zzfgv() {
    }

    public static zzfgv zza() {
        return zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
