package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
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

    public static int zze(int i2, int i3, String str) {
        String zzd;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                zzd = zzfmi.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                throw new IllegalArgumentException(a.R(26, "negative size: ", i3));
            } else {
                zzd = zzfmi.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(zzd);
        }
        return i2;
    }

    public static int zzf(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzh(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzg(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? zzh(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? zzh(i3, i4, "end index") : zzfmi.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    private static String zzh(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzfmi.zzd("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzfmi.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(a.R(26, "negative size: ", i3));
    }
}
