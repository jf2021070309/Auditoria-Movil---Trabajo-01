package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
@TargetApi(17)
/* loaded from: classes.dex */
public final class zzch {
    private static zzch zzb;
    public String zza;

    private zzch() {
    }

    public static zzch zza() {
        if (zzb == null) {
            zzb = new zzch();
        }
        return zzb;
    }
}
