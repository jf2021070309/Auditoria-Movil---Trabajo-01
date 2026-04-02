package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzgja {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzggm {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!zzgiz.zza(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (zzgiz.zza(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!zzgiz.zza(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                }
            } else if (zzgiz.zzb(b2)) {
                if (i6 < i3) {
                    zzgiz.zzd(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw zzggm.zzl();
                }
            } else if (zzgiz.zzc(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    zzgiz.zze(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw zzggm.zzl();
                }
            } else if (i6 < i3 - 2) {
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                zzgiz.zzf(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            } else {
                throw zzggm.zzl();
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzc(byte[] bArr, int i, int i2) throws zzggm;
}
