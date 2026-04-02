package com.google.android.gms.internal.ads;

import com.amazon.aps.iva.q.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzfoq {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(c0.a("negative size: ", i2));
            }
            zzb = zzfpf.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zzb = zzfpf.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzj(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpf.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzf(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzg(int i, int i2, int i3) {
        String zzj;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zzj = zzfpf.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzj = zzj(i2, i3, "end index");
            }
        } else {
            zzj = zzj(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zzj);
    }

    public static void zzh(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void zzi(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzj(int i, int i2, String str) {
        if (i < 0) {
            return zzfpf.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfpf.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(c0.a("negative size: ", i2));
    }
}
