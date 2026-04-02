package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdb {
    public static final zzdb zza = new zzdb(new int[]{2}, 8);
    private static final zzdb zzb = new zzdb(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzdb(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj;
            if (Arrays.equals(this.zzc, zzdbVar.zzc)) {
                int i = zzdbVar.zzd;
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=8, supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
