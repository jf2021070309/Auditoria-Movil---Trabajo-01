package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzfuc implements Comparable<zzfuc> {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzfuc zzfucVar) {
        zzfuc zzfucVar2 = zzfucVar;
        int length = this.zza.length;
        int length2 = zzfucVar2.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i2];
            byte b3 = zzfucVar2.zza[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfuc) {
            return Arrays.equals(this.zza, ((zzfuc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            sb.append("0123456789abcdef".charAt(i2 >> 4));
            sb.append("0123456789abcdef".charAt(i2 & 15));
        }
        return sb.toString();
    }
}
