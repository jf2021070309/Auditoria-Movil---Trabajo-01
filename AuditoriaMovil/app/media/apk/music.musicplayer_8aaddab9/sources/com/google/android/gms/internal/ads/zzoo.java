package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzoo {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzh(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = zzb[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? zzc[i5 - 1] : zzd[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? zze[i5 - 1] : zzf[i5 - 1] : zzg[i5 - 1];
        int i10 = SyslogConstants.LOG_LOCAL2;
        if (i3 == 3) {
            return a.m(i9, SyslogConstants.LOG_LOCAL2, i7, i8);
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return a.m(i10, i9, i7, i8);
    }

    public static int zzi(int i2) {
        int i3;
        int i4;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return zzm(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? 384 : 1152 : i2 == 3 ? 1152 : 576;
    }
}
