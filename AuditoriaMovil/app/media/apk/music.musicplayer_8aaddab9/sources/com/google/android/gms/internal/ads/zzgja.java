package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class zzgja {
    public static final String zzd(ByteBuffer byteBuffer, int i2, int i3) throws zzggm {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = byteBuffer.get(i2);
                if (!zzgiz.zza(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = byteBuffer.get(i2);
                if (zzgiz.zza(b3)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b3;
                    i2 = i7;
                    while (true) {
                        i6 = i8;
                        if (i2 < i4) {
                            byte b4 = byteBuffer.get(i2);
                            if (!zzgiz.zza(b4)) {
                                break;
                            }
                            i2++;
                            i8 = i6 + 1;
                            cArr[i6] = (char) b4;
                        }
                    }
                } else if (zzgiz.zzb(b3)) {
                    if (i7 >= i4) {
                        throw zzggm.zzl();
                    }
                    zzgiz.zzd(b3, byteBuffer.get(i7), cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                } else if (zzgiz.zzc(b3)) {
                    if (i7 >= i4 - 1) {
                        throw zzggm.zzl();
                    }
                    int i9 = i7 + 1;
                    zzgiz.zze(b3, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                    i2 = i9 + 1;
                    i6++;
                } else if (i7 >= i4 - 2) {
                    throw zzggm.zzl();
                } else {
                    int i10 = i7 + 1;
                    int i11 = i10 + 1;
                    zzgiz.zzf(b3, byteBuffer.get(i7), byteBuffer.get(i10), byteBuffer.get(i11), cArr, i6);
                    i6 += 2;
                    i2 = i11 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public final boolean zza(byte[] bArr, int i2, int i3) {
        return zzb(0, bArr, i2, i3) == 0;
    }

    public abstract int zzb(int i2, byte[] bArr, int i3, int i4);

    public abstract String zzc(byte[] bArr, int i2, int i3) throws zzggm;
}
