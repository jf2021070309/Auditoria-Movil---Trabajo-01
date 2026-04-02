package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzmq {
    private static final zzmn zza;

    static {
        if (zzml.zzx() && zzml.zzy()) {
            int i2 = zzij.zza;
        }
        zza = new zzmo();
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

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmq.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new zzmp(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder v = a.v(54, "UTF-8 length does not fit in int: ");
        v.append(i4 + 4294967296L);
        throw new IllegalArgumentException(v.toString());
    }

    public static String zzd(byte[] bArr, int i2, int i3) throws zzkh {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!zzmm.zzd(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = bArr[i2];
                if (zzmm.zzd(b3)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    i2 = i6;
                    while (true) {
                        i5 = i7;
                        if (i2 < i4) {
                            byte b4 = bArr[i2];
                            if (!zzmm.zzd(b4)) {
                                break;
                            }
                            i2++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b4;
                        }
                    }
                } else if (b3 < -32) {
                    if (i6 >= i4) {
                        throw zzkh.zzc();
                    }
                    zzmm.zzb(b3, bArr[i6], cArr, i5);
                    i2 = i6 + 1;
                    i5++;
                } else if (b3 < -16) {
                    if (i6 >= i4 - 1) {
                        throw zzkh.zzc();
                    }
                    int i8 = i6 + 1;
                    zzmm.zzc(b3, bArr[i6], bArr[i8], cArr, i5);
                    i2 = i8 + 1;
                    i5++;
                } else if (i6 >= i4 - 2) {
                    throw zzkh.zzc();
                } else {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    zzmm.zza(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                    i5 += 2;
                    i2 = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }
}
