package com.google.ads.interactivemedia.v3.internal;

import com.google.common.primitives.Ints;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzsi {
    public static int zza(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit) {
            int i2 = highestOneBit + highestOneBit;
            if (i2 > 0) {
                return i2;
            }
            return Ints.MAX_POWER_OF_TWO;
        }
        return highestOneBit;
    }

    public static int zzb(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int zzc(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return zzb(hashCode);
    }
}
