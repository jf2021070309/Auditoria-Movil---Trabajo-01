package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.q.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzrm {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(c0.a("negative size: ", i2));
            }
            zzb = zzro.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zzb = zzro.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzi(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzf(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzro.zzb(str, obj));
    }

    public static void zzg(int i, int i2, int i3) {
        String zzi;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zzi = zzro.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzi = zzi(i2, i3, "end index");
            }
        } else {
            zzi = zzi(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zzi);
    }

    public static void zzh(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzi(int i, int i2, String str) {
        if (i < 0) {
            return zzro.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzro.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(c0.a("negative size: ", i2));
    }
}
