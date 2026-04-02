package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzflx {
    public static void zza(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzb(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static <T> T zzc(@CheckForNull T t, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException((String) obj);
    }

    public static <T> T zzd(@CheckForNull T t, String str, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(zzfmi.zzd(str, obj));
    }

    public static int zze(int i, int i2, String str) {
        String zzd;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzd = zzfmi.zzd("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                zzd = zzfmi.zzd("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zzd);
        }
        return i;
    }

    public static int zzf(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzh(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzg(int i, int i2, int i3) {
        String zzh;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzh = zzh(i, i3, "start index");
            } else {
                zzh = (i2 < 0 || i2 > i3) ? zzh(i2, i3, "end index") : zzfmi.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzh);
        }
    }

    private static String zzh(int i, int i2, String str) {
        if (i < 0) {
            return zzfmi.zzd("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfmi.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
