package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int i2;
        int i3;
        int zzb = zzfob.zzb(obj);
        int i4 = zzb & i;
        int zzb2 = zzb(obj3, i4);
        if (zzb2 != 0) {
            int i5 = ~i;
            int i6 = zzb & i5;
            int i7 = -1;
            while (true) {
                i2 = zzb2 - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !zzflt.zza(obj, objArr[i2]) || (objArr2 != null && !zzflt.zza(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    zzb2 = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                zzc(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }
}
