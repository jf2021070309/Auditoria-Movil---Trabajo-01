package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzamy extends Exception {
    private zzamy(int i2, String str, Throwable th, int i3) {
        super(null, th);
    }

    public static zzamy zza(Exception exc, int i2) {
        return new zzamy(1, null, exc, i2);
    }

    public static zzamy zzb(IOException iOException) {
        return new zzamy(0, null, iOException, -1);
    }

    public static zzamy zzc(RuntimeException runtimeException) {
        return new zzamy(2, null, runtimeException, -1);
    }
}
