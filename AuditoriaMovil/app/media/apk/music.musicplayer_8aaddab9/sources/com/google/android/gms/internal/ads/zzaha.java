package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public class zzaha extends IOException {
    public final boolean zzb;
    public final int zzc;

    public zzaha(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.zzb = z;
        this.zzc = i2;
    }

    public static zzaha zza(String str, Throwable th) {
        return new zzaha(str, th, true, 0);
    }

    public static zzaha zzb(String str, Throwable th) {
        return new zzaha(str, th, true, 1);
    }

    public static zzaha zzc(String str) {
        return new zzaha(str, null, false, 1);
    }
}
