package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
public final class zzhd {
    private static final zzhb zza;

    static {
        if (zzgz.zzu() && zzgz.zzv()) {
            int i2 = zzdo.zza;
        }
        zza = new zzhc();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b3 = bArr[i2];
                if (b2 <= -12 && b3 <= -65) {
                    return b2 ^ (b3 << 8);
                }
            } else if (i4 != 2) {
                throw new AssertionError();
            } else {
                byte b4 = bArr[i2];
                byte b5 = bArr[i2 + 1];
                if (b2 <= -12 && b4 <= -65 && b5 <= -65) {
                    return ((b4 << 8) ^ b2) ^ (b5 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i2, int i3) throws zzew {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!zzha.zzd(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = bArr[i2];
                if (zzha.zzd(b3)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    i2 = i6;
                    while (true) {
                        i5 = i7;
                        if (i2 < i4) {
                            byte b4 = bArr[i2];
                            if (!zzha.zzd(b4)) {
                                break;
                            }
                            i2++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b4;
                        }
                    }
                } else if (b3 < -32) {
                    if (i6 >= i4) {
                        throw zzew.zzb();
                    }
                    zzha.zzb(b3, bArr[i6], cArr, i5);
                    i2 = i6 + 1;
                    i5++;
                } else if (b3 < -16) {
                    if (i6 >= i4 - 1) {
                        throw zzew.zzb();
                    }
                    int i8 = i6 + 1;
                    zzha.zzc(b3, bArr[i6], bArr[i8], cArr, i5);
                    i2 = i8 + 1;
                    i5++;
                } else if (i6 >= i4 - 2) {
                    throw zzew.zzb();
                } else {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    zzha.zza(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                    i5 += 2;
                    i2 = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }
}
