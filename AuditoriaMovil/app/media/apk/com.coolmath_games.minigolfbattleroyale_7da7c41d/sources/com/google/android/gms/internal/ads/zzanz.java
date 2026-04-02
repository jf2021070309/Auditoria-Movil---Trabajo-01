package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzanz {
    public static final zzanz zza = new zzanz(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    zzanz(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzanz) {
            zzanz zzanzVar = (zzanz) obj;
            if (Arrays.equals(this.zzb, zzanzVar.zzb)) {
                int i = zzanzVar.zzc;
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=2, supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
