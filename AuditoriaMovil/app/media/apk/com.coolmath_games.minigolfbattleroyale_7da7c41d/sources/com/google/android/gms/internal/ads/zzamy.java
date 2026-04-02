package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamy extends Exception {
    private zzamy(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static zzamy zza(Exception exc, int i) {
        return new zzamy(1, null, exc, i);
    }

    public static zzamy zzb(IOException iOException) {
        return new zzamy(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzamy zzc(RuntimeException runtimeException) {
        return new zzamy(2, null, runtimeException, -1);
    }
}
