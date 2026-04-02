package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public class zzak extends IOException {
    public final int zza;

    public zzak(int i2) {
        this.zza = i2;
    }

    public zzak(String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzak(String str, Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzak(Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}
