package com.google.android.gms.internal.atv_ads_framework;

import com.amazon.aps.iva.q.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzn {
    public static int zza(int i, int i2, String str) {
        String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(c0.a("negative size: ", i2));
            }
            zza = zzs.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zza = zzs.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zze(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    public static void zzc(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzd(int i, int i2, int i3) {
        String zze;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zze = zzs.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zze = zze(i2, i3, "end index");
            }
        } else {
            zze = zze(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zze);
    }

    private static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzs.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzs.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(c0.a("negative size: ", i2));
    }
}
