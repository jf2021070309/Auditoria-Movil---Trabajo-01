package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfkf extends Exception {
    private final int zza;

    public zzfkf(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzfkf(int i2, Throwable th) {
        super(th);
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }
}
