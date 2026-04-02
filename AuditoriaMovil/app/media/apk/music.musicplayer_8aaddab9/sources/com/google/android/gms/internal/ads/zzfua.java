package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzfua<P> {
    private final P zza;
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzfua(P p, byte[] bArr, int i2, int i3, int i4) {
        this.zza = p;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    public final P zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
