package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzdym extends Exception {
    private final int zza;

    public zzdym(int i2) {
        this.zza = i2;
    }

    public zzdym(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzdym(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}
