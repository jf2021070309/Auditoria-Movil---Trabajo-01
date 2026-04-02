package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzajw {
    public static final zzaju zza = zzajt.zza;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzaiv zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaju r13, com.google.android.gms.internal.ads.zzaix r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zza(byte[], int, com.google.android.gms.internal.ads.zzaju, com.google.android.gms.internal.ads.zzaix):com.google.android.gms.internal.ads.zzaiv");
    }

    private static boolean zzb(zzamf zzamfVar, int i, int i2, boolean z) {
        int zzr;
        long zzr2;
        int i3;
        int i4;
        int zzg = zzamfVar.zzg();
        while (true) {
            try {
                if (zzamfVar.zzd() < i2) {
                    return true;
                }
                if (i >= 3) {
                    zzr = zzamfVar.zzv();
                    zzr2 = zzamfVar.zzt();
                    i3 = zzamfVar.zzo();
                } else {
                    zzr = zzamfVar.zzr();
                    zzr2 = zzamfVar.zzr();
                    i3 = 0;
                }
                if (zzr == 0 && zzr2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & zzr2) != 0) {
                        return false;
                    }
                    zzr2 = ((zzr2 >> 24) << 21) | ((255 & (zzr2 >> 16)) << 14) | (zzr2 & 255) | (((zzr2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else if (i == 3) {
                    i4 = (i3 & 32) != 0 ? 1 : 0;
                    if ((i3 & 128) == 0) {
                        r4 = 0;
                    }
                } else {
                    i4 = 0;
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (zzr2 < i4) {
                    return false;
                }
                if (zzamfVar.zzd() < zzr2) {
                    return false;
                }
                zzamfVar.zzk((int) zzr2);
            } finally {
                zzamfVar.zzh(zzg);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0273, code lost:
        if (r9 == 67) goto L123;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0567: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:249:0x0565 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzajx zzc(int r34, com.google.android.gms.internal.ads.zzamf r35, boolean r36, int r37, com.google.android.gms.internal.ads.zzaju r38) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzc(int, com.google.android.gms.internal.ads.zzamf, boolean, int, com.google.android.gms.internal.ads.zzaju):com.google.android.gms.internal.ads.zzajx");
    }

    private static int zzd(zzamf zzamfVar, int i) {
        byte[] zzi = zzamfVar.zzi();
        int zzg = zzamfVar.zzg();
        int i2 = zzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzg + i) {
                return i;
            }
            if ((zzi[i2] & UByte.MAX_VALUE) == 255 && zzi[i3] == 0) {
                System.arraycopy(zzi, i2 + 2, zzi, i3, (i - (i2 - zzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zze(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzf(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzg(byte[] bArr, int i, int i2) {
        int zzh = zzh(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzh;
        }
        while (true) {
            int length = bArr.length;
            if (zzh >= length - 1) {
                return length;
            }
            if ((zzh - i) % 2 == 0 && bArr[zzh + 1] == 0) {
                return zzh;
            }
            zzh = zzh(bArr, zzh + 1);
        }
    }

    private static int zzh(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzi(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzj(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzamq.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzk(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}
