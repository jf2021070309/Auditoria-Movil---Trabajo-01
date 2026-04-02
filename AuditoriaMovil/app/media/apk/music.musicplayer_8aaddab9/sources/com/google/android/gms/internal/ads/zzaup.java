package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzaup {
    public static void zza(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static int zzc(int i2, int i3, int i4) {
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    public static void zzd(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zze(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static String zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
