package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzdb {
    public static final zzdb zza = new zzdb(new int[]{2}, 8);
    private static final zzdb zzb = new zzdb(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzdb(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzdb) && Arrays.equals(this.zzc, ((zzdb) obj).zzc);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzc);
        return a.s(new StringBuilder(String.valueOf(arrays).length() + 67), "AudioCapabilities[maxChannelCount=8, supportedEncodings=", arrays, "]");
    }
}
