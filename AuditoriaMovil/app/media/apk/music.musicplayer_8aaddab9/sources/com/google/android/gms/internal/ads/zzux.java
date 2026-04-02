package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzux {
    public final int zza;
    public final long zzb;

    private zzux(int i2, long j2) {
        this.zza = i2;
        this.zzb = j2;
    }

    public static zzux zza(zznv zznvVar, zzamf zzamfVar) throws IOException {
        ((zznp) zznvVar).zzh(zzamfVar.zzi(), 0, 8, false);
        zzamfVar.zzh(0);
        return new zzux(zzamfVar.zzv(), zzamfVar.zzu());
    }
}
