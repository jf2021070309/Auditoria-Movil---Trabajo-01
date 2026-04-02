package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgjb extends zzgja {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzgja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjb.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgja
    public final String zzc(byte[] bArr, int i2, int i3) throws zzggm {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!zzgiz.zza(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = bArr[i2];
                if (zzgiz.zza(b3)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    i2 = i6;
                    while (true) {
                        i5 = i7;
                        if (i2 < i4) {
                            byte b4 = bArr[i2];
                            if (!zzgiz.zza(b4)) {
                                break;
                            }
                            i2++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b4;
                        }
                    }
                } else if (zzgiz.zzb(b3)) {
                    if (i6 >= i4) {
                        throw zzggm.zzl();
                    }
                    zzgiz.zzd(b3, bArr[i6], cArr, i5);
                    i2 = i6 + 1;
                    i5++;
                } else if (zzgiz.zzc(b3)) {
                    if (i6 >= i4 - 1) {
                        throw zzggm.zzl();
                    }
                    int i8 = i6 + 1;
                    zzgiz.zze(b3, bArr[i6], bArr[i8], cArr, i5);
                    i2 = i8 + 1;
                    i5++;
                } else if (i6 >= i4 - 2) {
                    throw zzggm.zzl();
                } else {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    zzgiz.zzf(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                    i5 += 2;
                    i2 = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
