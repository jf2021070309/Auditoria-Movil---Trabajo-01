package com.google.android.gms.internal.ads;

import android.os.Build;
import ch.qos.logback.classic.Level;
import e.a.d.a.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class zzave {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    private static final Pattern zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i2 = 26;
        }
        zza = i2;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 17, String.valueOf(str3).length(), String.valueOf(str2).length()));
        a.M(sb, str, ", ", str3, ", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i2);
        zze = sb.toString();
        zzf = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzg = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzh = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static ExecutorService zzb(String str) {
        return Executors.newSingleThreadExecutor(new zzavd("Loader:ExtractorMediaPeriod"));
    }

    public static void zzc(zzatz zzatzVar) {
        if (zzatzVar != null) {
            try {
                zzatzVar.zzd();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] zzd(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int zze(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int zzf(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static float zzg(float f2, float f3, float f4) {
        return Math.max(0.1f, Math.min(f2, 8.0f));
    }

    public static int zzh(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = binarySearch + 1;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int zzi(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = binarySearch ^ (-1);
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static long zzj(long j2, long j3, long j4) {
        if (j4 < j3 || j4 % j3 != 0) {
            if (j4 >= j3 || j3 % j4 != 0) {
                double d2 = j2;
                double d3 = j3;
                double d4 = j4;
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d2);
                return (long) ((d3 / d4) * d2);
            }
            return (j3 / j4) * j2;
        }
        return j2 / (j4 / j3);
    }

    public static void zzk(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long j4 = j3 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (j3 < 1000000 && 1000000 % j3 == 0) {
            long j5 = 1000000 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        } else {
            double d2 = j3;
            Double.isNaN(d2);
            double d3 = 1000000.0d / d2;
            while (i2 < jArr.length) {
                double d4 = jArr[i2];
                Double.isNaN(d4);
                jArr[i2] = (long) (d4 * d3);
                i2++;
            }
        }
    }

    public static int zzl(String str) {
        int length = str.length();
        zzaup.zza(length <= 4);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 << 8) | str.charAt(i3);
        }
        return i2;
    }

    public static byte[] zzm(String str) {
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static String zzn(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static int zzo(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                return i2 != 24 ? i2 != 32 ? 0 : 1073741824 : Level.ALL_INT;
            }
            return 2;
        }
        return 3;
    }

    public static int zzp(int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 1073741824) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return i3;
                    }
                    throw new IllegalArgumentException();
                }
                return i3 + i3;
            }
            return i3 * 4;
        }
        return i3 * 3;
    }

    public static int zzq(int i2) {
        return i2 != 1 ? 13107200 : 3538944;
    }
}
