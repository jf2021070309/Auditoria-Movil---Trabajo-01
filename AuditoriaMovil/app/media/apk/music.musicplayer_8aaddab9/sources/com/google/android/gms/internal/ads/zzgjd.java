package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzgjd {
    private static final zzgja zza;

    static {
        if (zzgiy.zza() && zzgiy.zzb()) {
            int i2 = zzgei.zza;
        }
        zza = new zzgjb();
    }

    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    public static boolean zzb(byte[] bArr, int i2, int i3) {
        return zza.zza(bArr, i2, i3);
    }

    public static int zzc(int i2, byte[] bArr, int i3, int i4) {
        return zza.zzb(i2, bArr, i3, i4);
    }

    public static /* synthetic */ int zzf(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        } else if (i4 != 1) {
            if (i4 == 2) {
                return zzl(b2, bArr[i2], bArr[i2 + 1]);
            }
            throw new AssertionError();
        } else {
            return zzk(b2, bArr[i2]);
        }
    }

    public static int zzg(CharSequence charSequence) {
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
                                throw new zzgjc(i3, length2);
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

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzh(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjd.zzh(java.lang.CharSequence, byte[], int, int):int");
    }

    public static String zzi(ByteBuffer byteBuffer, int i2, int i3) throws zzggm {
        zzgja zzgjaVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgjaVar.zzc(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }
        return byteBuffer.isDirect() ? zzgja.zzd(byteBuffer, i2, i3) : zzgja.zzd(byteBuffer, i2, i3);
    }

    public static String zzj(byte[] bArr, int i2, int i3) throws zzggm {
        return zza.zzc(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
